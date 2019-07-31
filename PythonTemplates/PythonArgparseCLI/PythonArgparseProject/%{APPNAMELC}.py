#!/usr/bin/python3

import argparse
from argparse import HelpFormatter
from functools import partial


class CustomHelpFormatter(HelpFormatter):

    def _format_action_invocation(self, action):
        if not action.option_strings:
            # Use default methods for positional arguments
            default = self._get_default_metavar_for_positional(action)
            metavar, = self._metavar_formatter(action, default)(1)
            return metavar

        else:
            parts = []
            if action.nargs == 0:
                # Just add options, if they expects no values (like --help)
                parts.extend(action.option_strings)
            else:
                default = self._get_default_metavar_for_optional(action)
                args_string = self._format_args(action, default)
                for option_string in action.option_strings:
                    parts.append(option_string)
                # Join the argument names (like -p --param ) and add the metavar at the end
                return '%s %s' % (', '.join(parts), args_string)

            return ', '.join(parts)


""" 
With the custom formatter the metavar does not get displayed twice.
With the max_help_position you can decide how long the parameters + metavar should be before a line break gets inserted,
additionally the width parameter defines the maximum length of a line.
The difference can be seen here:
https://github.com/alex1701c/Screenshots/blob/master/PythonArgparseCLI/default_output.png
https://github.com/alex1701c/Screenshots/blob/master/PythonArgparseCLI/customized_output_format.png
"""

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Describe your project", formatter_class=partial(CustomHelpFormatter, max_help_position=48, width=400))
    parser.add_argument('-p', '--param', metavar="<MyParameter>", help='A optional parameter')
    parser.add_argument('-d', '--default-false', action='store_true', help='This Value is False by default')
    args = parser.parse_args()

    if args.default_false:
        print("You have used the --default-false option !")
    else:
        print("You have not used the --default-false option !")
