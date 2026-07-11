package oW;

import android.text.TextUtils;
import androidx.media3.container.MdtaMetadataEntry;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.common.api.Status;
import d8q.jqQ.QTafcm;
import java.util.Arrays;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class aC {
    public static Status n(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499);
        }
        String[] strArrSplit = str.split(":", 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        if (listAsList.size() > 1) {
            return rl((String) listAsList.get(0), (String) listAsList.get(1));
        }
        return rl((String) listAsList.get(0), null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Status rl(String str, String str2) {
        int i2;
        str.getClass();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    b2 = 0;
                }
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    b2 = 1;
                }
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    b2 = 2;
                }
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    b2 = 3;
                }
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    b2 = 4;
                }
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    b2 = 5;
                }
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    b2 = 6;
                }
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    b2 = 7;
                }
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    b2 = 8;
                }
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    b2 = 9;
                }
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    b2 = 10;
                }
                break;
            case -1584641425:
                if (str.equals("UNAUTHORIZED_DOMAIN")) {
                    b2 = 11;
                }
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    b2 = 12;
                }
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    b2 = 13;
                }
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    b2 = 14;
                }
                break;
            case -1368998244:
                if (str.equals("INVALID_HOSTING_LINK_DOMAIN")) {
                    b2 = 15;
                }
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    b2 = 16;
                }
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    b2 = 17;
                }
                break;
            case -1242922234:
                if (str.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    b2 = 18;
                }
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    b2 = 19;
                }
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    b2 = 20;
                }
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    b2 = 21;
                }
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    b2 = 22;
                }
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    b2 = 23;
                }
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    b2 = 24;
                }
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    b2 = 25;
                }
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    b2 = 26;
                }
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    b2 = 27;
                }
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    b2 = 28;
                }
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    b2 = 29;
                }
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    b2 = 30;
                }
                break;
            case -406804866:
                if (str.equals("INVALID_LOGIN_CREDENTIALS")) {
                    b2 = 31;
                }
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    b2 = 32;
                }
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    b2 = 33;
                }
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    b2 = 34;
                }
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    b2 = 35;
                }
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    b2 = 36;
                }
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    b2 = 37;
                }
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    b2 = 38;
                }
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    b2 = 39;
                }
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    b2 = 40;
                }
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    b2 = 41;
                }
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    b2 = 42;
                }
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    b2 = 43;
                }
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    b2 = 44;
                }
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    b2 = 45;
                }
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    b2 = 46;
                }
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    b2 = 47;
                }
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    b2 = 48;
                }
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    b2 = 49;
                }
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    b2 = 50;
                }
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    b2 = 51;
                }
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    b2 = 52;
                }
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    b2 = 53;
                }
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    b2 = 54;
                }
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    b2 = 55;
                }
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    b2 = 56;
                }
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    b2 = 57;
                }
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    b2 = 58;
                }
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    b2 = 59;
                }
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    b2 = 60;
                }
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    b2 = Base64.padSymbol;
                }
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    b2 = 62;
                }
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    b2 = 63;
                }
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    b2 = 64;
                }
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    b2 = 65;
                }
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    b2 = 66;
                }
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    b2 = 67;
                }
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    b2 = 68;
                }
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    b2 = 69;
                }
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    b2 = 70;
                }
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    b2 = 71;
                }
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    b2 = 72;
                }
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    b2 = 73;
                }
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    b2 = 74;
                }
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    b2 = 75;
                }
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    b2 = 76;
                }
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    b2 = 77;
                }
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    b2 = 78;
                }
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    b2 = 79;
                }
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    b2 = 80;
                }
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    b2 = 81;
                }
                break;
        }
        switch (b2) {
            case 0:
                i2 = 18001;
                break;
            case 1:
                i2 = 17033;
                break;
            case 2:
                i2 = 17057;
                break;
            case 3:
                i2 = 17091;
                break;
            case 4:
            case 31:
            case 64:
                i2 = 17004;
                break;
            case 5:
                i2 = 17068;
                break;
            case 6:
                i2 = 17052;
                break;
            case 7:
                i2 = 17061;
                break;
            case 8:
                i2 = 17206;
                break;
            case 9:
                i2 = 17200;
                break;
            case 10:
                i2 = 17029;
                break;
            case 11:
                i2 = 17038;
                break;
            case 12:
                i2 = 17030;
                break;
            case 13:
                i2 = 17034;
                break;
            case 14:
                i2 = 17044;
                break;
            case 15:
                i2 = 17214;
                break;
            case 16:
                i2 = 17021;
                break;
            case 17:
                i2 = 17079;
                break;
            case 18:
                i2 = 18002;
                break;
            case 19:
                i2 = 17046;
                break;
            case 20:
                i2 = 17087;
                break;
            case 21:
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                i2 = 17008;
                break;
            case 22:
                i2 = 17085;
                break;
            case 23:
                i2 = 17094;
                break;
            case 24:
                i2 = 17064;
                break;
            case 25:
                i2 = 17016;
                break;
            case 26:
                i2 = 17084;
                break;
            case 27:
                i2 = 17035;
                break;
            case 28:
                i2 = 17014;
                break;
            case 29:
            case 67:
                i2 = 17020;
                break;
            case 30:
                i2 = 17207;
                break;
            case 32:
                i2 = 17203;
                break;
            case 33:
            case 52:
                i2 = 17006;
                break;
            case 34:
                i2 = 17062;
                break;
            case 35:
                i2 = 17088;
                break;
            case 36:
                i2 = 17082;
                break;
            case 37:
            case 40:
                i2 = 17011;
                break;
            case 38:
                i2 = 17056;
                break;
            case 39:
                i2 = 17026;
                break;
            case 41:
                i2 = 17089;
                break;
            case 42:
                i2 = 17032;
                break;
            case 43:
                i2 = 17041;
                break;
            case 44:
                i2 = 17074;
                break;
            case 45:
                i2 = 17081;
                break;
            case 46:
                i2 = 17095;
                break;
            case 47:
                i2 = 17007;
                break;
            case 48:
                i2 = 17017;
                break;
            case 49:
                i2 = 17065;
                break;
            case 50:
                i2 = 17204;
                break;
            case 51:
                i2 = 17205;
                break;
            case 53:
                i2 = 17086;
                break;
            case 54:
                i2 = 17075;
                break;
            case 55:
                i2 = 17083;
                break;
            case 56:
                i2 = 17049;
                break;
            case 57:
                i2 = 17071;
                break;
            case 58:
                i2 = 17002;
                break;
            case 59:
                i2 = 17058;
                break;
            case 60:
                i2 = 17078;
                break;
            case 61:
                i2 = 17093;
                break;
            case 62:
                i2 = 17031;
                break;
            case 63:
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                i2 = 17010;
                break;
            case 65:
                i2 = 17000;
                break;
            case 66:
                i2 = 17009;
                break;
            case 68:
                i2 = 17202;
                break;
            case 69:
                i2 = 17051;
                break;
            case 70:
                i2 = 17043;
                break;
            case 71:
                i2 = 17025;
                break;
            case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                i2 = 17201;
                break;
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                i2 = 17005;
                break;
            case 75:
                i2 = 17042;
                break;
            case 76:
                i2 = 17028;
                break;
            case MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64 /* 78 */:
                i2 = 17040;
                break;
            case 79:
                i2 = 17045;
                break;
            case 80:
                i2 = 17090;
                break;
            case 81:
                i2 = 17073;
                break;
            default:
                i2 = 17499;
                break;
        }
        if (i2 == 17499) {
            if (str2 != null) {
                return new Status(i2, str + QTafcm.IEZ + str2);
            }
            return new Status(i2, str);
        }
        return new Status(i2, str2);
    }
}
