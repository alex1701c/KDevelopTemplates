import argparse


class ArgsNamespace(argparse.Namespace):
    name: str
    extra: bool
