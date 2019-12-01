#!/usr/bin/python3

import argparse
from argparse import HelpFormatter
from functools import partial
from typing import Any, cast


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


class ArgsNamespace(argparse.Namespace):
    name: str
    extra: bool

    def __init__(self, **kwargs: Any) -> None:
        super().__init__(**kwargs)


""" 
In addition to the other Python argparse CLI template this one supports type checking. 
Make sure that you have the Python KDevelop plugin installed.
"""

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='Describe your project', formatter_class=CustomHelpFormatter)
    parser.add_argument('-v', '--version', action='version', version='%{APPNAMELC} 1.0')
    parser.add_argument('-n', '--name', metavar='<name>', help='An optional parameter')
    parser.add_argument('-e', '--extra', action='store_true', help='This Value is False by default')
    args: ArgsNamespace = cast(ArgsNamespace, parser.parse_args())

    if args.name and args.extra:
        print('Hello There ' + args.name + '!')
    elif args.extra:
        print('Hello There!')
    elif args.name:
        print('Hello ' + args.name + '!')
    else:
        print('Hello World!')

