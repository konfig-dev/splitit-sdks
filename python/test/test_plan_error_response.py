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
from splitit_client.model.failed_response import FailedResponse
from splitit_client.model.plan_error_response_all_of import PlanErrorResponseAllOf
globals()['ErrorExtended'] = ErrorExtended
globals()['FailedResponse'] = FailedResponse
globals()['PlanErrorResponseAllOf'] = PlanErrorResponseAllOf
from splitit_client.model.plan_error_response import PlanErrorResponse


class TestPlanErrorResponse(unittest.TestCase):
    """PlanErrorResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testPlanErrorResponse(self):
        """Test PlanErrorResponse"""
        # FIXME: construct object with mandatory attributes with example values
        # model = PlanErrorResponse()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
