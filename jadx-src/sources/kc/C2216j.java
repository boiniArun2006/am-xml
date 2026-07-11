package kc;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.ads.AdError;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kc.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C2216j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2216j f70061n = new C2216j();

    /* JADX INFO: renamed from: kc.j$j, reason: collision with other inner class name */
    public /* synthetic */ class C1034j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OnFyberMarketplaceInitializedListener.FyberInitStatus.values().length];
            try {
                iArr[OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InneractiveErrorCode.values().length];
            try {
                iArr2[InneractiveErrorCode.CONNECTION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InneractiveErrorCode.CONNECTION_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InneractiveErrorCode.NO_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InneractiveErrorCode.SERVER_INVALID_RESPONSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[InneractiveErrorCode.SERVER_INTERNAL_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[InneractiveErrorCode.SDK_INTERNAL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[InneractiveErrorCode.UNSPECIFIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[InneractiveErrorCode.LOAD_TIMEOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[InneractiveErrorCode.INVALID_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[InneractiveErrorCode.SPOT_DISABLED.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[InneractiveErrorCode.UNSUPPORTED_SPOT.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[InneractiveErrorCode.IN_FLIGHT_TIMEOUT.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[InneractiveErrorCode.SDK_NOT_INITIALIZED.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[InneractiveErrorCode.NATIVE_ADS_NOT_SUPPORTED_FOR_OS.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT.ordinal()] = 17;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR.ordinal()] = 18;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[InneractiveErrorCode.ERROR_CODE_NATIVE_VIDEO_NOT_SUPPORTED.ordinal()] = 19;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final AdError n(InneractiveErrorCode inneractiveErrorCode) {
        Intrinsics.checkNotNullParameter(inneractiveErrorCode, "inneractiveErrorCode");
        int i2 = 399;
        switch (C1034j.$EnumSwitchMapping$1[inneractiveErrorCode.ordinal()]) {
            case 1:
                i2 = d.f62986a;
                break;
            case 2:
                i2 = Sdk.SDKError.Reason.MRAID_ERROR_VALUE;
                break;
            case 3:
                i2 = Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE;
                break;
            case 4:
                i2 = 303;
                break;
            case 5:
                i2 = Sdk.SDKError.Reason.AD_EXPIRED_VALUE;
                break;
            case 6:
                i2 = Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE;
                break;
            case 7:
                i2 = 306;
                break;
            case 8:
                i2 = 307;
                break;
            case 9:
                i2 = 308;
                break;
            case 10:
                i2 = Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE;
                break;
            case 11:
                i2 = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
                break;
            case 12:
                i2 = Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE;
                break;
            case 13:
                i2 = Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE;
                break;
            case 14:
                i2 = Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE;
                break;
            case 15:
                i2 = Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE;
                break;
            case 16:
                i2 = Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE;
                break;
            case 17:
                i2 = Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE;
                break;
            case 18:
                i2 = Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE;
                break;
        }
        return new AdError(i2, "DT Exchange failed to request ad with reason: " + inneractiveErrorCode, "com.google.ads.mediation.dtexchange");
    }

    public static final AdError rl(OnFyberMarketplaceInitializedListener.FyberInitStatus initStatus) {
        Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        int i2 = C1034j.$EnumSwitchMapping$0[initStatus.ordinal()];
        return new AdError(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 299 : Sdk.SDKError.Reason.AD_IS_LOADING_VALUE : Sdk.SDKError.Reason.AD_CONSUMED_VALUE : 201 : 200, "DT Exchange failed to initialize with reason: " + initStatus, "com.google.ads.mediation.dtexchange");
    }

    private C2216j() {
    }
}
