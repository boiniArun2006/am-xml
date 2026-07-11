package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import cS.Zv.SzFNXybiSxdx;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface TypedValues {

    public interface Custom {
    }

    public interface MotionScene {
    }

    public interface OnSwipe {
    }

    public interface TransitionType {
    }

    public interface TriggerType {
    }

    boolean O(int i2, String str);

    int n(String str);

    boolean nr(int i2, boolean z2);

    boolean rl(int i2, int i3);

    boolean t(int i2, float f3);

    public interface AttributesType {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String[] f35312n = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", "frame", "target", "pivotTarget"};

        static int n(String str) {
            str.getClass();
            switch (str) {
                case "easing":
                    return Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE;
                case "rotationX":
                    return 308;
                case "rotationY":
                    return Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE;
                case "rotationZ":
                    return Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
                case "translationX":
                    return Sdk.SDKError.Reason.AD_EXPIRED_VALUE;
                case "translationY":
                    return Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE;
                case "translationZ":
                    return 306;
                case "progress":
                    return Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE;
                case "pivotX":
                    return Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE;
                case "pivotY":
                    return Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE;
                case "scaleX":
                    return Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE;
                case "scaleY":
                    return Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE;
                case "target":
                    return 101;
                case "elevation":
                    return 307;
                case "alpha":
                    return 303;
                case "frame":
                    return 100;
                case "curveFit":
                    return Sdk.SDKError.Reason.MRAID_ERROR_VALUE;
                case "pathRotate":
                    return Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE;
                case "pivotTarget":
                    return Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE;
                case "visibility":
                    return Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE;
                default:
                    return -1;
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public interface CycleType {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String[] f35313n = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", SzFNXybiSxdx.TGjsYZjWczt, "progress", "pathRotate", "easing", "waveShape", "customWave", "period", "offset", "phase"};

        static int n(String str) {
            byte b2;
            str.getClass();
            switch (str.hashCode()) {
                case -1310311125:
                    b2 = !str.equals("easing") ? (byte) -1 : (byte) 0;
                    break;
                case -1249320806:
                    b2 = !str.equals("rotationX") ? (byte) -1 : (byte) 1;
                    break;
                case -1249320805:
                    b2 = !str.equals("rotationY") ? (byte) -1 : (byte) 2;
                    break;
                case -1249320804:
                    b2 = !str.equals("rotationZ") ? (byte) -1 : (byte) 3;
                    break;
                case -1225497657:
                    b2 = !str.equals("translationX") ? (byte) -1 : (byte) 4;
                    break;
                case -1225497656:
                    b2 = !str.equals("translationY") ? (byte) -1 : (byte) 5;
                    break;
                case -1225497655:
                    b2 = !str.equals("translationZ") ? (byte) -1 : (byte) 6;
                    break;
                case -1001078227:
                    b2 = !str.equals("progress") ? (byte) -1 : (byte) 7;
                    break;
                case -987906986:
                    b2 = !str.equals("pivotX") ? (byte) -1 : (byte) 8;
                    break;
                case -987906985:
                    b2 = !str.equals("pivotY") ? (byte) -1 : (byte) 9;
                    break;
                case -908189618:
                    b2 = !str.equals("scaleX") ? (byte) -1 : (byte) 10;
                    break;
                case -908189617:
                    b2 = !str.equals("scaleY") ? (byte) -1 : (byte) 11;
                    break;
                case 92909918:
                    b2 = !str.equals("alpha") ? (byte) -1 : (byte) 12;
                    break;
                case 579057826:
                    b2 = !str.equals(obbPUqyhtS.YCdD) ? (byte) -1 : (byte) 13;
                    break;
                case 803192288:
                    b2 = !str.equals("pathRotate") ? (byte) -1 : (byte) 14;
                    break;
                case 1941332754:
                    b2 = !str.equals("visibility") ? (byte) -1 : (byte) 15;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    return 420;
                case 1:
                    return 308;
                case 2:
                    return Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE;
                case 3:
                    return Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
                case 4:
                    return Sdk.SDKError.Reason.AD_EXPIRED_VALUE;
                case 5:
                    return Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE;
                case 6:
                    return 306;
                case 7:
                    return Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE;
                case 8:
                    return Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE;
                case 9:
                    return Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE;
                case 10:
                    return Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE;
                case 11:
                    return Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE;
                case 12:
                    return 403;
                case 13:
                    return 401;
                case 14:
                    return 416;
                case 15:
                    return 402;
                default:
                    return -1;
            }
        }
    }

    public interface MotionType {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String[] f35314n = {"Stagger", "PathRotate", "QuantizeMotionPhase", "TransitionEasing", "QuantizeInterpolator", "AnimateRelativeTo", "AnimateCircleAngleTo", "PathMotionArc", "DrawPath", "PolarRelativeTo", "QuantizeMotionSteps", "QuantizeInterpolatorType", "QuantizeInterpolatorID"};

        static int n(String str) {
            str.getClass();
            switch (str) {
                case "AnimateCircleAngleTo":
                    return 606;
                case "QuantizeMotionPhase":
                    return 602;
                case "QuantizeMotionSteps":
                    return 610;
                case "PathRotate":
                    return Sdk.SDKError.Reason.NATIVE_VIDEO_PLAYBACK_ERROR_VALUE;
                case "QuantizeInterpolator":
                    return 604;
                case "DrawPath":
                    return 608;
                case "Stagger":
                    return Sdk.SDKError.Reason.NATIVE_ASSET_ERROR_VALUE;
                case "PolarRelativeTo":
                    return 609;
                case "QuantizeInterpolatorType":
                    return 611;
                case "QuantizeInterpolatorID":
                    return 612;
                case "TransitionEasing":
                    return 603;
                case "AnimateRelativeTo":
                    return 605;
                case "PathMotionArc":
                    return 607;
                default:
                    return -1;
            }
        }
    }

    public interface PositionType {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String[] f35315n = {"transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY"};

        static int n(String str) {
            str.getClass();
            switch (str) {
                case "transitionEasing":
                    return 501;
                case "percentWidth":
                    return 503;
                case "percentHeight":
                    return 504;
                case "drawPath":
                    return 502;
                case "sizePercent":
                    return 505;
                case "percentX":
                    return 506;
                case "percentY":
                    return 507;
                default:
                    return -1;
            }
        }
    }
}
