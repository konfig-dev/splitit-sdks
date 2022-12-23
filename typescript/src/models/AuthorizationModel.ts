/* DO NOT TOUCH: This file was generated by Konfig */

/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */

import type { GwAuthorizationStatus } from './GwAuthorizationStatus';
import type { ThreeDsRedirectData } from './ThreeDsRedirectData';

export type AuthorizationModel = {
    Status: GwAuthorizationStatus;
    Date?: string;
    SplititErrorResultCode?: string;
    GatewayTransactionID?: string;
    GatewayResultCode?: string;
    GatewayResultMessage?: string;
    ThreeDSRedirect?: ThreeDsRedirectData;
    CAVV?: string;
    ECI?: string;
};

