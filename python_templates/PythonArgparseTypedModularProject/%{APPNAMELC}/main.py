#!/usr/bin/python3

import argparse
from typing import cast

from .utilities.ArgsNamespace import ArgsNamespace
from .utilities.CustomHelpFormatter import CustomHelpFormatter

""" 
Make sure that you have the Python KDevelop plugin installed.
"""


def main():
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
