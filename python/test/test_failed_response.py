"""
    splitit-web-api-v3

    Splitit's API  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""


import sys
import unittest

import splitit_client
from splitit_client.model.error_extended import ErrorExtended
from splitit_client.model.failed_response_all_of import FailedResponseAllOf
from splitit_client.model.response_v2 import ResponseV2
globals()['ErrorExtended'] = ErrorExtended
globals()['FailedResponseAllOf'] = FailedResponseAllOf
globals()['ResponseV2'] = ResponseV2
from splitit_client.model.failed_response import FailedResponse


class TestFailedResponse(unittest.TestCase):
    """FailedResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testFailedResponse(self):
        """Test FailedResponse"""
        # FIXME: construct object with mandatory attributes with example values
        # model = FailedResponse()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
