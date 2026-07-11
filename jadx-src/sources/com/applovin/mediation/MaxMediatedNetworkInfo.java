package com.applovin.mediation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface MaxMediatedNetworkInfo {

    public enum InitializationStatus {
        NOT_INITIALIZED(-4),
        DOES_NOT_APPLY(-3),
        INITIALIZING(-2),
        INITIALIZED_UNKNOWN(-1),
        INITIALIZED_FAILURE(0),
        INITIALIZED_SUCCESS(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f51046a;

        public int getCode() {
            return this.f51046a;
        }

        InitializationStatus(int i2) {
            this.f51046a = i2;
        }

        public static InitializationStatus fromCode(int i2) {
            for (InitializationStatus initializationStatus : values()) {
                if (initializationStatus.getCode() == i2) {
                    return initializationStatus;
                }
            }
            return NOT_INITIALIZED;
        }
    }

    String getAdapterClassName();

    String getAdapterVersion();

    InitializationStatus getInitializationStatus();

    String getName();

    String getSdkVersion();
}
