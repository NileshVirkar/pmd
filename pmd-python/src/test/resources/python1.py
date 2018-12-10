# Example source code copied from the Django project on GitHub
# https://github.com/django/django/blob/master/django/core/handlers/base.py
from __future__ import unicode_literals

import logging
import sys
import types

class BaseHandler(object):
    # Changes that are always applied to a response (in this order).
    def apply_response_fixes(self, request, response):
# Changes that are always applied to a response (in this order).
        for func in self.response_fixes:
            response = func(request, response)
        return response