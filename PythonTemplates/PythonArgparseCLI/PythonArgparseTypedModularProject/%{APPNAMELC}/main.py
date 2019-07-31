#!/usr/bin/python3

import argparse
from typing import cast

from .utilities.ArgsNamespace import ArgsNamespace
from .utilities.CustomHelpFormatter import CustomHelpFormatter

""" 
Make sure that your have the Python KDevelop plugin installed.
"""


def main():
    parser = argparse.ArgumentParser(description='Describe your project', formatter_class=CustomHelpFormatter)
    parser.add_argument('-p', '--param', metavar='<MyParameter>', help='A optional parameter')
    parser.add_argument('-d', '--default-false', action='store_true', help='This Value is False by default')
    args: ArgsNamespace = cast(ArgsNamespace, parser.parse_args())

    if args.default_false:
        print('You have used the --default-false option !')
    else:
        print('You have not used the --default-false option !')
