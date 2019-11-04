#!/usr/bin/python3

from setuptools import setup, find_packages

setup(
    name='%{APPNAME}',
    version='1.0.0',
    author='%{AUTHOR}',
    author_email='%{EMAIL}',
    description='%{DESCRIPTION}',
    url='%{URL}',
    entry_points={
        'console_scripts': ['pythonmodularkrunner = pythonmodularkrunner.main:main'],
    },
    packages=find_packages(),
)
