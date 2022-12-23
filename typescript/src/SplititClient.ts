/* DO NOT TOUCH: This file was generated by Konfig */

/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { BaseHttpRequest } from './core/BaseHttpRequest';
import type { ConfigType } from './core/Config';
import { NodeHttpRequest } from './core/NodeHttpRequest';

import { InstallmentPlanService } from './services/InstallmentPlanService';

type HttpRequestConstructor = new (config: ConfigType) => BaseHttpRequest;

export class SplititClient {

    public readonly installmentPlan: InstallmentPlanService;

    public readonly request: BaseHttpRequest;

    constructor(config?: Partial<ConfigType>, HttpRequest: HttpRequestConstructor = NodeHttpRequest) {
        this.request = new HttpRequest({
            BASE: config?.BASE ?? 'https://web-api-v3.sandbox.splitit.com',
            VERSION: config?.VERSION ?? '1.0.0',
            WITH_CREDENTIALS: config?.WITH_CREDENTIALS ?? false,
            CREDENTIALS: config?.CREDENTIALS ?? 'include',
            TOKEN: config?.TOKEN,
            USERNAME: config?.USERNAME,
            PASSWORD: config?.PASSWORD,
            HEADERS: config?.HEADERS,
            ENCODE_PATH: config?.ENCODE_PATH,
        });

        this.installmentPlan = new InstallmentPlanService(this.request);
    }
}
