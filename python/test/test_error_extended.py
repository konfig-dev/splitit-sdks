"""
    splitit-web-api-v3

    Splitit's API  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""


import sys
import unittest

import splitit_client
from splitit_client.model.error import Error
from splitit_client.model.error_extended_all_of import ErrorExtendedAllOf
globals()['Error'] = Error
globals()['ErrorExtendedAllOf'] = ErrorExtendedAllOf
from splitit_client.model.error_extended import ErrorExtended


class TestErrorExtended(unittest.TestCase):
    """ErrorExtended unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testErrorExtended(self):
        """Test ErrorExtended"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ErrorExtended()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
