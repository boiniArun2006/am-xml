package com.bendingspoons.oracle.models;

import Du.DC;
import Du.Dsr;
import Du.Y5;
import Du.i;
import Du.iF;
import Du.mz;
import Du.vd;
import EJn.Wre;
import XA.Ml;
import XA.Xo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import ep.oxM.esLNYym;
import gi.I28;
import gi.w6;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b^\b\u0087\b\u0018\u0000 \u0084\u00012\u00020\u0001:\u0004\u0085\u0001\u0086\u0001B\u0085\u0002\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\t\u0012\u0014\b\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0012\u001a\u00020\r\u0012\b\b\u0003\u0010\u0013\u001a\u00020\r\u0012\b\b\u0003\u0010\u0014\u001a\u00020\r\u0012\b\b\u0003\u0010\u0015\u001a\u00020\r\u0012\b\b\u0003\u0010\u0016\u001a\u00020\r\u0012\b\b\u0003\u0010\u0017\u001a\u00020\r\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001b\u001a\u00020\t\u0012\b\b\u0003\u0010\u001c\u001a\u00020\r\u0012\b\b\u0003\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fB\u0081\u0002\b\u0010\u0012\u0006\u0010 \u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\r\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J'\u0010,\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010.J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010.J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010.J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010.J\u0010\u00104\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b6\u00105J\u001c\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010.J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010.J\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b;\u0010.J\u0010\u0010<\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b>\u0010=J\u0010\u0010?\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b?\u0010=J\u0010\u0010@\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b@\u0010=J\u0010\u0010A\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bA\u0010=J\u0010\u0010B\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bB\u0010=J\u0010\u0010C\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bC\u0010.J\u0010\u0010D\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bD\u0010.J\u0010\u0010E\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bE\u0010.J\u0010\u0010F\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bF\u00105J\u0010\u0010G\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bG\u0010=J\u0010\u0010H\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bH\u0010=J\u008e\u0002\u0010I\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\u0014\b\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f2\b\b\u0003\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\r2\b\b\u0003\u0010\u0013\u001a\u00020\r2\b\b\u0003\u0010\u0014\u001a\u00020\r2\b\b\u0003\u0010\u0015\u001a\u00020\r2\b\b\u0003\u0010\u0016\u001a\u00020\r2\b\b\u0003\u0010\u0017\u001a\u00020\r2\b\b\u0003\u0010\u0018\u001a\u00020\u00022\b\b\u0003\u0010\u0019\u001a\u00020\u00022\b\b\u0003\u0010\u001a\u001a\u00020\u00022\b\b\u0003\u0010\u001b\u001a\u00020\t2\b\b\u0003\u0010\u001c\u001a\u00020\r2\b\b\u0003\u0010\u001d\u001a\u00020\rHÆ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bK\u0010.J\u0010\u0010L\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bL\u0010=J\u001a\u0010N\u001a\u00020\t2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bN\u0010OR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010P\u0012\u0004\bR\u0010S\u001a\u0004\bQ\u0010.R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010P\u0012\u0004\bU\u0010S\u001a\u0004\bT\u0010.R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010P\u0012\u0004\bW\u0010S\u001a\u0004\bV\u0010.R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010P\u0012\u0004\bY\u0010S\u001a\u0004\bX\u0010.R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010P\u0012\u0004\b[\u0010S\u001a\u0004\bZ\u0010.R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010P\u0012\u0004\b]\u0010S\u001a\u0004\b\\\u0010.R(\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010^\u0012\u0004\ba\u0010S\u001a\u0004\b\n\u00105\"\u0004\b_\u0010`R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010^\u0012\u0004\bb\u0010S\u001a\u0004\b\u000b\u00105R,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010c\u0012\u0004\be\u0010S\u001a\u0004\bd\u00108R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010P\u0012\u0004\bg\u0010S\u001a\u0004\bf\u0010.R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010P\u0012\u0004\bi\u0010S\u001a\u0004\bh\u0010.R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010P\u0012\u0004\bk\u0010S\u001a\u0004\bj\u0010.R \u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010l\u0012\u0004\bn\u0010S\u001a\u0004\bm\u0010=R \u0010\u0013\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010l\u0012\u0004\bp\u0010S\u001a\u0004\bo\u0010=R \u0010\u0014\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010l\u0012\u0004\br\u0010S\u001a\u0004\bq\u0010=R \u0010\u0015\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010l\u0012\u0004\bt\u0010S\u001a\u0004\bs\u0010=R \u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010l\u0012\u0004\bv\u0010S\u001a\u0004\bu\u0010=R \u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010l\u0012\u0004\bx\u0010S\u001a\u0004\bw\u0010=R \u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010P\u0012\u0004\bz\u0010S\u001a\u0004\by\u0010.R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010P\u0012\u0004\b|\u0010S\u001a\u0004\b{\u0010.R \u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010P\u0012\u0004\b~\u0010S\u001a\u0004\b}\u0010.R \u0010\u001b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010^\u0012\u0004\b\u007f\u0010S\u001a\u0004\b\u001b\u00105R\"\u0010\u001c\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001c\u0010l\u0012\u0005\b\u0081\u0001\u0010S\u001a\u0005\b\u0080\u0001\u0010=R\"\u0010\u001d\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001d\u0010l\u0012\u0005\b\u0083\u0001\u0010S\u001a\u0005\b\u0082\u0001\u0010=¨\u0006\u0087\u0001"}, d2 = {"Lcom/bendingspoons/oracle/models/Settings;", "", "", "tosUrl", "privacyUrl", "tosVersion", "privacyVersion", "tosEffectiveDate", "tosUpdateMessage", "", "isFreeUser", "isBaselineUser", "", "", "experiments", "privacyRequestEmail", "privacyRequestEmailCC", "privacyRequestUrlTemplate", "softReviewTriggersFactor", "hardReviewTriggersFactor", "maxReviewRequestsPerVersion", "minTimeBetweenReviewRequests", "firstSoftReviewTriggersFactorDivider", "minTimeAfterAcceptedReviewRequest", "encryptionAlgorithm", "encryptionKeyId", "encryptionPublicKey", "isSpoonerDevice", "minRequiredBuildNumber", "minSuggestedBuildNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZII)V", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/models/Settings;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Z", "component8", "component9", "()Ljava/util/Map;", "component10", "component11", "component12", "component13", "()I", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZII)Lcom/bendingspoons/oracle/models/Settings;", "toString", "hashCode", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTosUrl", "getTosUrl$annotations", "()V", "getPrivacyUrl", "getPrivacyUrl$annotations", "getTosVersion", "getTosVersion$annotations", "getPrivacyVersion", "getPrivacyVersion$annotations", "getTosEffectiveDate", "getTosEffectiveDate$annotations", "getTosUpdateMessage", "getTosUpdateMessage$annotations", "Z", "setFreeUser", "(Z)V", "isFreeUser$annotations", "isBaselineUser$annotations", "Ljava/util/Map;", "getExperiments", "getExperiments$annotations", "getPrivacyRequestEmail", "getPrivacyRequestEmail$annotations", "getPrivacyRequestEmailCC", "getPrivacyRequestEmailCC$annotations", "getPrivacyRequestUrlTemplate", "getPrivacyRequestUrlTemplate$annotations", "I", "getSoftReviewTriggersFactor", "getSoftReviewTriggersFactor$annotations", "getHardReviewTriggersFactor", "getHardReviewTriggersFactor$annotations", "getMaxReviewRequestsPerVersion", "getMaxReviewRequestsPerVersion$annotations", "getMinTimeBetweenReviewRequests", "getMinTimeBetweenReviewRequests$annotations", "getFirstSoftReviewTriggersFactorDivider", "getFirstSoftReviewTriggersFactorDivider$annotations", "getMinTimeAfterAcceptedReviewRequest", "getMinTimeAfterAcceptedReviewRequest$annotations", "getEncryptionAlgorithm", "getEncryptionAlgorithm$annotations", "getEncryptionKeyId", "getEncryptionKeyId$annotations", "getEncryptionPublicKey", "getEncryptionPublicKey$annotations", "isSpoonerDevice$annotations", "getMinRequiredBuildNumber", "getMinRequiredBuildNumber$annotations", "getMinSuggestedBuildNumber", "getMinSuggestedBuildNumber$annotations", "Companion", c.f62177j, "j", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo
public final /* data */ class Settings {
    private static final int ONE_MONTH = 2592000;
    private static final int TEN_MINUTES = 600;
    private final String encryptionAlgorithm;
    private final String encryptionKeyId;
    private final String encryptionPublicKey;
    private final Map<String, Integer> experiments;
    private final int firstSoftReviewTriggersFactorDivider;
    private final int hardReviewTriggersFactor;
    private final boolean isBaselineUser;
    private boolean isFreeUser;
    private final boolean isSpoonerDevice;
    private final int maxReviewRequestsPerVersion;
    private final int minRequiredBuildNumber;
    private final int minSuggestedBuildNumber;
    private final int minTimeAfterAcceptedReviewRequest;
    private final int minTimeBetweenReviewRequests;
    private final String privacyRequestEmail;
    private final String privacyRequestEmailCC;
    private final String privacyRequestUrlTemplate;
    private final String privacyUrl;
    private final String privacyVersion;
    private final int softReviewTriggersFactor;
    private final String tosEffectiveDate;
    private final String tosUpdateMessage;
    private final String tosUrl;
    private final String tosVersion;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmField
    private static final Ml[] $childSerializers = {null, null, null, null, null, null, null, null, new mz(Y5.f2000n, iF.f2020n), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public /* synthetic */ class j implements vd {
        private static final Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f51431n;
        public static final int rl;

        private j() {
        }

        static {
            j jVar = new j();
            f51431n = jVar;
            rl = 8;
            DC dc = new DC("com.bendingspoons.oracle.models.Settings", jVar, 24);
            dc.HI("__terms_of_service_url__", true);
            dc.HI("__privacy_notice_url__", true);
            dc.HI("__terms_of_service_version__", true);
            dc.HI("__privacy_notice_version__", true);
            dc.HI("__terms_of_service_effective_date__", true);
            dc.HI("__terms_of_service_update_message__", true);
            dc.HI("__is_free__", true);
            dc.HI("__is_baseline__", true);
            dc.HI("__experiments__", true);
            dc.HI("privacy_request_email", true);
            dc.HI("privacy_request_email_cc", true);
            dc.HI("privacy_request_url_template", true);
            dc.HI("review_soft_trigger_factor", true);
            dc.HI("review_hard_trigger_factor", true);
            dc.HI("review_max_requests_per_version", true);
            dc.HI("review_min_time_between_requests", true);
            dc.HI("review_first_soft_trigger_factor_divider", true);
            dc.HI("review_min_time_after_accepted_review_request", true);
            dc.HI("__encryption_algorithm__", true);
            dc.HI("__encryption_key_id__", true);
            dc.HI("__encryption_public_key__", true);
            dc.HI("is_spooner_device", true);
            dc.HI("min_required_build_number", true);
            dc.HI("min_suggested_build_number", true);
            descriptor = dc;
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final Settings deserialize(I28 decoder) {
            int i2;
            int i3;
            Map map;
            String str;
            int i5;
            int i7;
            int i8;
            boolean z2;
            int i9;
            int iXQ;
            boolean z3;
            boolean z4;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            int i10;
            int i11;
            int i12;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            Wre wre = descriptor;
            w6 w6VarRl = decoder.rl(wre);
            Ml[] mlArr = Settings.$childSerializers;
            int i13 = 6;
            if (w6VarRl.HI()) {
                String strIk = w6VarRl.Ik(wre, 0);
                String strIk2 = w6VarRl.Ik(wre, 1);
                String strIk3 = w6VarRl.Ik(wre, 2);
                String strIk4 = w6VarRl.Ik(wre, 3);
                String strIk5 = w6VarRl.Ik(wre, 4);
                String str13 = (String) w6VarRl.e(wre, 5, Y5.f2000n, null);
                boolean zMUb = w6VarRl.mUb(wre, 6);
                boolean zMUb2 = w6VarRl.mUb(wre, 7);
                Map map2 = (Map) w6VarRl.fD(wre, 8, mlArr[8], null);
                String strIk6 = w6VarRl.Ik(wre, 9);
                String strIk7 = w6VarRl.Ik(wre, 10);
                String strIk8 = w6VarRl.Ik(wre, 11);
                int iXQ2 = w6VarRl.XQ(wre, 12);
                int iXQ3 = w6VarRl.XQ(wre, 13);
                int iXQ4 = w6VarRl.XQ(wre, 14);
                int iXQ5 = w6VarRl.XQ(wre, 15);
                int iXQ6 = w6VarRl.XQ(wre, 16);
                int iXQ7 = w6VarRl.XQ(wre, 17);
                String strIk9 = w6VarRl.Ik(wre, 18);
                String strIk10 = w6VarRl.Ik(wre, 19);
                String strIk11 = w6VarRl.Ik(wre, 20);
                boolean zMUb3 = w6VarRl.mUb(wre, 21);
                int iXQ8 = w6VarRl.XQ(wre, 22);
                str12 = strIk11;
                iXQ = w6VarRl.XQ(wre, 23);
                str2 = strIk;
                z3 = zMUb;
                str = str13;
                str5 = strIk4;
                str6 = strIk5;
                str4 = strIk3;
                str7 = strIk6;
                str3 = strIk2;
                z4 = zMUb2;
                str8 = strIk7;
                str9 = strIk8;
                i10 = iXQ2;
                i11 = iXQ3;
                str11 = strIk10;
                str10 = strIk9;
                i8 = iXQ7;
                i7 = iXQ6;
                i5 = iXQ5;
                i2 = iXQ4;
                map = map2;
                z2 = zMUb3;
                i9 = iXQ8;
                i3 = 16777215;
            } else {
                boolean z5 = true;
                int iXQ9 = 0;
                int i14 = 0;
                int iXQ10 = 0;
                int iXQ11 = 0;
                boolean zMUb4 = false;
                int iXQ12 = 0;
                int iXQ13 = 0;
                boolean zMUb5 = false;
                boolean zMUb6 = false;
                int iXQ14 = 0;
                int iXQ15 = 0;
                Map map3 = null;
                String strIk12 = null;
                String strIk13 = null;
                String strIk14 = null;
                String strIk15 = null;
                String strIk16 = null;
                String strIk17 = null;
                String strIk18 = null;
                String strIk19 = null;
                String strIk20 = null;
                String strIk21 = null;
                String strIk22 = null;
                int iXQ16 = 0;
                String str14 = null;
                while (z5) {
                    int iNY = w6VarRl.nY(wre);
                    switch (iNY) {
                        case -1:
                            z5 = false;
                            i13 = 6;
                            break;
                        case 0:
                            strIk12 = w6VarRl.Ik(wre, 0);
                            i14 |= 1;
                            i13 = 6;
                            break;
                        case 1:
                            strIk13 = w6VarRl.Ik(wre, 1);
                            i14 |= 2;
                            i13 = 6;
                            break;
                        case 2:
                            strIk14 = w6VarRl.Ik(wre, 2);
                            i14 |= 4;
                            i13 = 6;
                            break;
                        case 3:
                            strIk15 = w6VarRl.Ik(wre, 3);
                            i14 |= 8;
                            break;
                        case 4:
                            strIk16 = w6VarRl.Ik(wre, 4);
                            i14 |= 16;
                            break;
                        case 5:
                            str14 = (String) w6VarRl.e(wre, 5, Y5.f2000n, str14);
                            i14 |= 32;
                            break;
                        case 6:
                            zMUb5 = w6VarRl.mUb(wre, i13);
                            i14 |= 64;
                            break;
                        case 7:
                            zMUb6 = w6VarRl.mUb(wre, 7);
                            i14 |= 128;
                            break;
                        case 8:
                            map3 = (Map) w6VarRl.fD(wre, 8, mlArr[8], map3);
                            i14 |= 256;
                            break;
                        case 9:
                            strIk17 = w6VarRl.Ik(wre, 9);
                            i14 |= 512;
                            break;
                        case 10:
                            strIk18 = w6VarRl.Ik(wre, 10);
                            i14 |= 1024;
                            break;
                        case 11:
                            strIk19 = w6VarRl.Ik(wre, 11);
                            i14 |= 2048;
                            break;
                        case 12:
                            iXQ14 = w6VarRl.XQ(wre, 12);
                            i14 |= 4096;
                            break;
                        case 13:
                            iXQ15 = w6VarRl.XQ(wre, 13);
                            i14 |= 8192;
                            break;
                        case 14:
                            i14 |= 16384;
                            iXQ9 = w6VarRl.XQ(wre, 14);
                            break;
                        case 15:
                            i14 |= 32768;
                            iXQ16 = w6VarRl.XQ(wre, 15);
                            break;
                        case 16:
                            iXQ10 = w6VarRl.XQ(wre, 16);
                            i14 |= 65536;
                            break;
                        case 17:
                            iXQ11 = w6VarRl.XQ(wre, 17);
                            i14 |= 131072;
                            break;
                        case 18:
                            strIk20 = w6VarRl.Ik(wre, 18);
                            i14 |= 262144;
                            break;
                        case 19:
                            strIk21 = w6VarRl.Ik(wre, 19);
                            i14 |= 524288;
                            break;
                        case 20:
                            strIk22 = w6VarRl.Ik(wre, 20);
                            i14 |= 1048576;
                            break;
                        case 21:
                            zMUb4 = w6VarRl.mUb(wre, 21);
                            i12 = 2097152;
                            i14 |= i12;
                            break;
                        case 22:
                            iXQ12 = w6VarRl.XQ(wre, 22);
                            i12 = 4194304;
                            i14 |= i12;
                            break;
                        case 23:
                            iXQ13 = w6VarRl.XQ(wre, 23);
                            i12 = 8388608;
                            i14 |= i12;
                            break;
                        default:
                            throw new UnknownFieldException(iNY);
                    }
                }
                i2 = iXQ9;
                i3 = i14;
                map = map3;
                str = str14;
                i5 = iXQ16;
                i7 = iXQ10;
                i8 = iXQ11;
                z2 = zMUb4;
                i9 = iXQ12;
                iXQ = iXQ13;
                z3 = zMUb5;
                z4 = zMUb6;
                str2 = strIk12;
                str3 = strIk13;
                str4 = strIk14;
                str5 = strIk15;
                str6 = strIk16;
                str7 = strIk17;
                str8 = strIk18;
                str9 = strIk19;
                str10 = strIk20;
                str11 = strIk21;
                str12 = strIk22;
                i10 = iXQ14;
                i11 = iXQ15;
            }
            w6VarRl.t(wre);
            return new Settings(i3, str2, str3, str4, str5, str6, str, z3, z4, map, str7, str8, str9, i10, i11, i2, i5, i7, i8, str10, str11, str12, z2, i9, iXQ, (i) null);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, Settings value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            Settings.write$Self$oracle_release(value, mlRl, wre);
            mlRl.t(wre);
        }

        @Override // Du.vd
        public final Ml[] childSerializers() {
            Ml[] mlArr = Settings.$childSerializers;
            Y5 y5 = Y5.f2000n;
            Ml mlZ = WY.j.Z(y5);
            Ml ml = mlArr[8];
            Dsr dsr = Dsr.f1956n;
            iF iFVar = iF.f2020n;
            return new Ml[]{y5, y5, y5, y5, y5, mlZ, dsr, dsr, ml, y5, y5, y5, iFVar, iFVar, iFVar, iFVar, iFVar, iFVar, y5, y5, y5, dsr, iFVar, iFVar};
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.oracle.models.Settings$n, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Ml serializer() {
            return j.f51431n;
        }
    }

    public Settings() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (Map) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, 0, 0, (String) null, (String) null, (String) null, false, 0, 0, 16777215, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Settings copy$default(Settings settings, String str, String str2, String str3, String str4, String str5, String str6, boolean z2, boolean z3, Map map, String str7, String str8, String str9, int i2, int i3, int i5, int i7, int i8, int i9, String str10, String str11, String str12, boolean z4, int i10, int i11, int i12, Object obj) {
        int i13;
        int i14;
        String str13 = (i12 & 1) != 0 ? settings.tosUrl : str;
        String str14 = (i12 & 2) != 0 ? settings.privacyUrl : str2;
        String str15 = (i12 & 4) != 0 ? settings.tosVersion : str3;
        String str16 = (i12 & 8) != 0 ? settings.privacyVersion : str4;
        String str17 = (i12 & 16) != 0 ? settings.tosEffectiveDate : str5;
        String str18 = (i12 & 32) != 0 ? settings.tosUpdateMessage : str6;
        boolean z5 = (i12 & 64) != 0 ? settings.isFreeUser : z2;
        boolean z6 = (i12 & 128) != 0 ? settings.isBaselineUser : z3;
        Map map2 = (i12 & 256) != 0 ? settings.experiments : map;
        String str19 = (i12 & 512) != 0 ? settings.privacyRequestEmail : str7;
        String str20 = (i12 & 1024) != 0 ? settings.privacyRequestEmailCC : str8;
        String str21 = (i12 & 2048) != 0 ? settings.privacyRequestUrlTemplate : str9;
        int i15 = (i12 & 4096) != 0 ? settings.softReviewTriggersFactor : i2;
        int i16 = (i12 & 8192) != 0 ? settings.hardReviewTriggersFactor : i3;
        String str22 = str13;
        int i17 = (i12 & 16384) != 0 ? settings.maxReviewRequestsPerVersion : i5;
        int i18 = (i12 & 32768) != 0 ? settings.minTimeBetweenReviewRequests : i7;
        int i19 = (i12 & 65536) != 0 ? settings.firstSoftReviewTriggersFactorDivider : i8;
        int i20 = (i12 & 131072) != 0 ? settings.minTimeAfterAcceptedReviewRequest : i9;
        String str23 = (i12 & 262144) != 0 ? settings.encryptionAlgorithm : str10;
        String str24 = (i12 & 524288) != 0 ? settings.encryptionKeyId : str11;
        String str25 = (i12 & 1048576) != 0 ? settings.encryptionPublicKey : str12;
        boolean z7 = (i12 & 2097152) != 0 ? settings.isSpoonerDevice : z4;
        int i21 = (i12 & 4194304) != 0 ? settings.minRequiredBuildNumber : i10;
        if ((i12 & 8388608) != 0) {
            i14 = i21;
            i13 = settings.minSuggestedBuildNumber;
        } else {
            i13 = i11;
            i14 = i21;
        }
        return settings.copy(str22, str14, str15, str16, str17, str18, z5, z6, map2, str19, str20, str21, i15, i16, i17, i18, i19, i20, str23, str24, str25, z7, i14, i13);
    }

    public static /* synthetic */ void getEncryptionAlgorithm$annotations() {
    }

    public static /* synthetic */ void getEncryptionKeyId$annotations() {
    }

    public static /* synthetic */ void getEncryptionPublicKey$annotations() {
    }

    public static /* synthetic */ void getExperiments$annotations() {
    }

    public static /* synthetic */ void getFirstSoftReviewTriggersFactorDivider$annotations() {
    }

    public static /* synthetic */ void getHardReviewTriggersFactor$annotations() {
    }

    public static /* synthetic */ void getMaxReviewRequestsPerVersion$annotations() {
    }

    public static /* synthetic */ void getMinRequiredBuildNumber$annotations() {
    }

    public static /* synthetic */ void getMinSuggestedBuildNumber$annotations() {
    }

    public static /* synthetic */ void getMinTimeAfterAcceptedReviewRequest$annotations() {
    }

    public static /* synthetic */ void getMinTimeBetweenReviewRequests$annotations() {
    }

    public static /* synthetic */ void getPrivacyRequestEmail$annotations() {
    }

    public static /* synthetic */ void getPrivacyRequestEmailCC$annotations() {
    }

    public static /* synthetic */ void getPrivacyRequestUrlTemplate$annotations() {
    }

    public static /* synthetic */ void getPrivacyUrl$annotations() {
    }

    public static /* synthetic */ void getPrivacyVersion$annotations() {
    }

    public static /* synthetic */ void getSoftReviewTriggersFactor$annotations() {
    }

    public static /* synthetic */ void getTosEffectiveDate$annotations() {
    }

    public static /* synthetic */ void getTosUpdateMessage$annotations() {
    }

    public static /* synthetic */ void getTosUrl$annotations() {
    }

    public static /* synthetic */ void getTosVersion$annotations() {
    }

    public static /* synthetic */ void isBaselineUser$annotations() {
    }

    public static /* synthetic */ void isFreeUser$annotations() {
    }

    public static /* synthetic */ void isSpoonerDevice$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTosUrl() {
        return this.tosUrl;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPrivacyRequestEmail() {
        return this.privacyRequestEmail;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPrivacyRequestEmailCC() {
        return this.privacyRequestEmailCC;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPrivacyRequestUrlTemplate() {
        return this.privacyRequestUrlTemplate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getSoftReviewTriggersFactor() {
        return this.softReviewTriggersFactor;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getHardReviewTriggersFactor() {
        return this.hardReviewTriggersFactor;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getMaxReviewRequestsPerVersion() {
        return this.maxReviewRequestsPerVersion;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getMinTimeBetweenReviewRequests() {
        return this.minTimeBetweenReviewRequests;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getFirstSoftReviewTriggersFactorDivider() {
        return this.firstSoftReviewTriggersFactorDivider;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getMinTimeAfterAcceptedReviewRequest() {
        return this.minTimeAfterAcceptedReviewRequest;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrivacyUrl() {
        return this.privacyUrl;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getEncryptionPublicKey() {
        return this.encryptionPublicKey;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getIsSpoonerDevice() {
        return this.isSpoonerDevice;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getMinRequiredBuildNumber() {
        return this.minRequiredBuildNumber;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getMinSuggestedBuildNumber() {
        return this.minSuggestedBuildNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTosVersion() {
        return this.tosVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrivacyVersion() {
        return this.privacyVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTosEffectiveDate() {
        return this.tosEffectiveDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTosUpdateMessage() {
        return this.tosUpdateMessage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsFreeUser() {
        return this.isFreeUser;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsBaselineUser() {
        return this.isBaselineUser;
    }

    public final Map<String, Integer> component9() {
        return this.experiments;
    }

    public final Settings copy(@Json(name = "__terms_of_service_url__") String tosUrl, @Json(name = "__privacy_notice_url__") String privacyUrl, @Json(name = "__terms_of_service_version__") String tosVersion, @Json(name = "__privacy_notice_version__") String privacyVersion, @Json(name = "__terms_of_service_effective_date__") String tosEffectiveDate, @Json(name = "__terms_of_service_update_message__") String tosUpdateMessage, @Json(name = "__is_free__") boolean isFreeUser, @Json(name = "__is_baseline__") boolean isBaselineUser, @Json(name = "__experiments__") Map<String, Integer> experiments, @Json(name = "privacy_request_email") String privacyRequestEmail, @Json(name = "privacy_request_email_cc") String privacyRequestEmailCC, @Json(name = "privacy_request_url_template") String privacyRequestUrlTemplate, @Json(name = "review_soft_trigger_factor") int softReviewTriggersFactor, @Json(name = "review_hard_trigger_factor") int hardReviewTriggersFactor, @Json(name = "review_max_requests_per_version") int maxReviewRequestsPerVersion, @Json(name = "review_min_time_between_requests") int minTimeBetweenReviewRequests, @Json(name = "review_first_soft_trigger_factor_divider") int firstSoftReviewTriggersFactorDivider, @Json(name = "review_min_time_after_accepted_review_request") int minTimeAfterAcceptedReviewRequest, @Json(name = "__encryption_algorithm__") String encryptionAlgorithm, @Json(name = "__encryption_key_id__") String encryptionKeyId, @Json(name = "__encryption_public_key__") String encryptionPublicKey, @Json(name = "is_spooner_device") boolean isSpoonerDevice, @Json(name = "min_required_build_number") int minRequiredBuildNumber, @Json(name = "min_suggested_build_number") int minSuggestedBuildNumber) {
        Intrinsics.checkNotNullParameter(tosUrl, "tosUrl");
        Intrinsics.checkNotNullParameter(privacyUrl, "privacyUrl");
        Intrinsics.checkNotNullParameter(tosVersion, "tosVersion");
        Intrinsics.checkNotNullParameter(privacyVersion, "privacyVersion");
        Intrinsics.checkNotNullParameter(tosEffectiveDate, "tosEffectiveDate");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(privacyRequestEmail, "privacyRequestEmail");
        Intrinsics.checkNotNullParameter(privacyRequestEmailCC, "privacyRequestEmailCC");
        Intrinsics.checkNotNullParameter(privacyRequestUrlTemplate, esLNYym.fiKNFSOT);
        Intrinsics.checkNotNullParameter(encryptionAlgorithm, "encryptionAlgorithm");
        Intrinsics.checkNotNullParameter(encryptionKeyId, "encryptionKeyId");
        Intrinsics.checkNotNullParameter(encryptionPublicKey, "encryptionPublicKey");
        return new Settings(tosUrl, privacyUrl, tosVersion, privacyVersion, tosEffectiveDate, tosUpdateMessage, isFreeUser, isBaselineUser, experiments, privacyRequestEmail, privacyRequestEmailCC, privacyRequestUrlTemplate, softReviewTriggersFactor, hardReviewTriggersFactor, maxReviewRequestsPerVersion, minTimeBetweenReviewRequests, firstSoftReviewTriggersFactorDivider, minTimeAfterAcceptedReviewRequest, encryptionAlgorithm, encryptionKeyId, encryptionPublicKey, isSpoonerDevice, minRequiredBuildNumber, minSuggestedBuildNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Settings)) {
            return false;
        }
        Settings settings = (Settings) other;
        return Intrinsics.areEqual(this.tosUrl, settings.tosUrl) && Intrinsics.areEqual(this.privacyUrl, settings.privacyUrl) && Intrinsics.areEqual(this.tosVersion, settings.tosVersion) && Intrinsics.areEqual(this.privacyVersion, settings.privacyVersion) && Intrinsics.areEqual(this.tosEffectiveDate, settings.tosEffectiveDate) && Intrinsics.areEqual(this.tosUpdateMessage, settings.tosUpdateMessage) && this.isFreeUser == settings.isFreeUser && this.isBaselineUser == settings.isBaselineUser && Intrinsics.areEqual(this.experiments, settings.experiments) && Intrinsics.areEqual(this.privacyRequestEmail, settings.privacyRequestEmail) && Intrinsics.areEqual(this.privacyRequestEmailCC, settings.privacyRequestEmailCC) && Intrinsics.areEqual(this.privacyRequestUrlTemplate, settings.privacyRequestUrlTemplate) && this.softReviewTriggersFactor == settings.softReviewTriggersFactor && this.hardReviewTriggersFactor == settings.hardReviewTriggersFactor && this.maxReviewRequestsPerVersion == settings.maxReviewRequestsPerVersion && this.minTimeBetweenReviewRequests == settings.minTimeBetweenReviewRequests && this.firstSoftReviewTriggersFactorDivider == settings.firstSoftReviewTriggersFactorDivider && this.minTimeAfterAcceptedReviewRequest == settings.minTimeAfterAcceptedReviewRequest && Intrinsics.areEqual(this.encryptionAlgorithm, settings.encryptionAlgorithm) && Intrinsics.areEqual(this.encryptionKeyId, settings.encryptionKeyId) && Intrinsics.areEqual(this.encryptionPublicKey, settings.encryptionPublicKey) && this.isSpoonerDevice == settings.isSpoonerDevice && this.minRequiredBuildNumber == settings.minRequiredBuildNumber && this.minSuggestedBuildNumber == settings.minSuggestedBuildNumber;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.tosUrl.hashCode() * 31) + this.privacyUrl.hashCode()) * 31) + this.tosVersion.hashCode()) * 31) + this.privacyVersion.hashCode()) * 31) + this.tosEffectiveDate.hashCode()) * 31;
        String str = this.tosUpdateMessage;
        return ((((((((((((((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isFreeUser)) * 31) + Boolean.hashCode(this.isBaselineUser)) * 31) + this.experiments.hashCode()) * 31) + this.privacyRequestEmail.hashCode()) * 31) + this.privacyRequestEmailCC.hashCode()) * 31) + this.privacyRequestUrlTemplate.hashCode()) * 31) + Integer.hashCode(this.softReviewTriggersFactor)) * 31) + Integer.hashCode(this.hardReviewTriggersFactor)) * 31) + Integer.hashCode(this.maxReviewRequestsPerVersion)) * 31) + Integer.hashCode(this.minTimeBetweenReviewRequests)) * 31) + Integer.hashCode(this.firstSoftReviewTriggersFactorDivider)) * 31) + Integer.hashCode(this.minTimeAfterAcceptedReviewRequest)) * 31) + this.encryptionAlgorithm.hashCode()) * 31) + this.encryptionKeyId.hashCode()) * 31) + this.encryptionPublicKey.hashCode()) * 31) + Boolean.hashCode(this.isSpoonerDevice)) * 31) + Integer.hashCode(this.minRequiredBuildNumber)) * 31) + Integer.hashCode(this.minSuggestedBuildNumber);
    }

    public String toString() {
        return "Settings(tosUrl=" + this.tosUrl + ", privacyUrl=" + this.privacyUrl + ", tosVersion=" + this.tosVersion + ", privacyVersion=" + this.privacyVersion + ", tosEffectiveDate=" + this.tosEffectiveDate + ", tosUpdateMessage=" + this.tosUpdateMessage + ", isFreeUser=" + this.isFreeUser + ", isBaselineUser=" + this.isBaselineUser + ", experiments=" + this.experiments + ", privacyRequestEmail=" + this.privacyRequestEmail + ", privacyRequestEmailCC=" + this.privacyRequestEmailCC + ", privacyRequestUrlTemplate=" + this.privacyRequestUrlTemplate + ", softReviewTriggersFactor=" + this.softReviewTriggersFactor + ", hardReviewTriggersFactor=" + this.hardReviewTriggersFactor + ", maxReviewRequestsPerVersion=" + this.maxReviewRequestsPerVersion + ", minTimeBetweenReviewRequests=" + this.minTimeBetweenReviewRequests + ", firstSoftReviewTriggersFactorDivider=" + this.firstSoftReviewTriggersFactorDivider + ", minTimeAfterAcceptedReviewRequest=" + this.minTimeAfterAcceptedReviewRequest + ", encryptionAlgorithm=" + this.encryptionAlgorithm + ", encryptionKeyId=" + this.encryptionKeyId + ", encryptionPublicKey=" + this.encryptionPublicKey + ", isSpoonerDevice=" + this.isSpoonerDevice + ", minRequiredBuildNumber=" + this.minRequiredBuildNumber + ", minSuggestedBuildNumber=" + this.minSuggestedBuildNumber + ")";
    }

    public /* synthetic */ Settings(int i2, String str, String str2, String str3, String str4, String str5, String str6, boolean z2, boolean z3, Map map, String str7, String str8, String str9, int i3, int i5, int i7, int i8, int i9, int i10, String str10, String str11, String str12, boolean z4, int i11, int i12, i iVar) {
        if ((i2 & 1) == 0) {
            this.tosUrl = "";
        } else {
            this.tosUrl = str;
        }
        if ((i2 & 2) == 0) {
            this.privacyUrl = "";
        } else {
            this.privacyUrl = str2;
        }
        if ((i2 & 4) == 0) {
            this.tosVersion = "";
        } else {
            this.tosVersion = str3;
        }
        if ((i2 & 8) == 0) {
            this.privacyVersion = "";
        } else {
            this.privacyVersion = str4;
        }
        if ((i2 & 16) == 0) {
            this.tosEffectiveDate = "";
        } else {
            this.tosEffectiveDate = str5;
        }
        if ((i2 & 32) == 0) {
            this.tosUpdateMessage = null;
        } else {
            this.tosUpdateMessage = str6;
        }
        if ((i2 & 64) == 0) {
            this.isFreeUser = false;
        } else {
            this.isFreeUser = z2;
        }
        if ((i2 & 128) == 0) {
            this.isBaselineUser = false;
        } else {
            this.isBaselineUser = z3;
        }
        if ((i2 & 256) == 0) {
            this.experiments = MapsKt.emptyMap();
        } else {
            this.experiments = map;
        }
        if ((i2 & 512) == 0) {
            this.privacyRequestEmail = "";
        } else {
            this.privacyRequestEmail = str7;
        }
        if ((i2 & 1024) == 0) {
            this.privacyRequestEmailCC = "";
        } else {
            this.privacyRequestEmailCC = str8;
        }
        if ((i2 & 2048) == 0) {
            this.privacyRequestUrlTemplate = "";
        } else {
            this.privacyRequestUrlTemplate = str9;
        }
        this.softReviewTriggersFactor = (i2 & 4096) == 0 ? 10 : i3;
        if ((i2 & 8192) == 0) {
            this.hardReviewTriggersFactor = 1;
        } else {
            this.hardReviewTriggersFactor = i5;
        }
        this.maxReviewRequestsPerVersion = (i2 & 16384) == 0 ? 5 : i7;
        this.minTimeBetweenReviewRequests = (32768 & i2) == 0 ? 600 : i8;
        if ((65536 & i2) == 0) {
            this.firstSoftReviewTriggersFactorDivider = 1;
        } else {
            this.firstSoftReviewTriggersFactorDivider = i9;
        }
        this.minTimeAfterAcceptedReviewRequest = (131072 & i2) == 0 ? ONE_MONTH : i10;
        if ((262144 & i2) == 0) {
            this.encryptionAlgorithm = "";
        } else {
            this.encryptionAlgorithm = str10;
        }
        if ((524288 & i2) == 0) {
            this.encryptionKeyId = "";
        } else {
            this.encryptionKeyId = str11;
        }
        if ((1048576 & i2) == 0) {
            this.encryptionPublicKey = "";
        } else {
            this.encryptionPublicKey = str12;
        }
        if ((2097152 & i2) == 0) {
            this.isSpoonerDevice = false;
        } else {
            this.isSpoonerDevice = z4;
        }
        if ((4194304 & i2) == 0) {
            this.minRequiredBuildNumber = 0;
        } else {
            this.minRequiredBuildNumber = i11;
        }
        if ((i2 & 8388608) == 0) {
            this.minSuggestedBuildNumber = 0;
        } else {
            this.minSuggestedBuildNumber = i12;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$oracle_release(Settings self, gi.Ml output, Wre serialDesc) {
        Ml[] mlArr = $childSerializers;
        if (output.r(serialDesc, 0) || !Intrinsics.areEqual(self.tosUrl, "")) {
            output.O(serialDesc, 0, self.tosUrl);
        }
        if (output.r(serialDesc, 1) || !Intrinsics.areEqual(self.privacyUrl, "")) {
            output.O(serialDesc, 1, self.privacyUrl);
        }
        if (output.r(serialDesc, 2) || !Intrinsics.areEqual(self.tosVersion, "")) {
            output.O(serialDesc, 2, self.tosVersion);
        }
        if (output.r(serialDesc, 3) || !Intrinsics.areEqual(self.privacyVersion, "")) {
            output.O(serialDesc, 3, self.privacyVersion);
        }
        if (output.r(serialDesc, 4) || !Intrinsics.areEqual(self.tosEffectiveDate, "")) {
            output.O(serialDesc, 4, self.tosEffectiveDate);
        }
        if (output.r(serialDesc, 5) || self.tosUpdateMessage != null) {
            output.X(serialDesc, 5, Y5.f2000n, self.tosUpdateMessage);
        }
        if (output.r(serialDesc, 6) || self.isFreeUser) {
            output.qie(serialDesc, 6, self.isFreeUser);
        }
        if (output.r(serialDesc, 7) || self.isBaselineUser) {
            output.qie(serialDesc, 7, self.isBaselineUser);
        }
        if (output.r(serialDesc, 8) || !Intrinsics.areEqual(self.experiments, MapsKt.emptyMap())) {
            output.S(serialDesc, 8, mlArr[8], self.experiments);
        }
        if (output.r(serialDesc, 9) || !Intrinsics.areEqual(self.privacyRequestEmail, "")) {
            output.O(serialDesc, 9, self.privacyRequestEmail);
        }
        if (output.r(serialDesc, 10) || !Intrinsics.areEqual(self.privacyRequestEmailCC, "")) {
            output.O(serialDesc, 10, self.privacyRequestEmailCC);
        }
        if (output.r(serialDesc, 11) || !Intrinsics.areEqual(self.privacyRequestUrlTemplate, "")) {
            output.O(serialDesc, 11, self.privacyRequestUrlTemplate);
        }
        if (output.r(serialDesc, 12) || self.softReviewTriggersFactor != 10) {
            output.fD(serialDesc, 12, self.softReviewTriggersFactor);
        }
        if (output.r(serialDesc, 13) || self.hardReviewTriggersFactor != 1) {
            output.fD(serialDesc, 13, self.hardReviewTriggersFactor);
        }
        if (output.r(serialDesc, 14) || self.maxReviewRequestsPerVersion != 5) {
            output.fD(serialDesc, 14, self.maxReviewRequestsPerVersion);
        }
        if (output.r(serialDesc, 15) || self.minTimeBetweenReviewRequests != 600) {
            output.fD(serialDesc, 15, self.minTimeBetweenReviewRequests);
        }
        if (output.r(serialDesc, 16) || self.firstSoftReviewTriggersFactorDivider != 1) {
            output.fD(serialDesc, 16, self.firstSoftReviewTriggersFactorDivider);
        }
        if (output.r(serialDesc, 17) || self.minTimeAfterAcceptedReviewRequest != ONE_MONTH) {
            output.fD(serialDesc, 17, self.minTimeAfterAcceptedReviewRequest);
        }
        if (output.r(serialDesc, 18) || !Intrinsics.areEqual(self.encryptionAlgorithm, "")) {
            output.O(serialDesc, 18, self.encryptionAlgorithm);
        }
        if (output.r(serialDesc, 19) || !Intrinsics.areEqual(self.encryptionKeyId, "")) {
            output.O(serialDesc, 19, self.encryptionKeyId);
        }
        if (output.r(serialDesc, 20) || !Intrinsics.areEqual(self.encryptionPublicKey, "")) {
            output.O(serialDesc, 20, self.encryptionPublicKey);
        }
        if (output.r(serialDesc, 21) || self.isSpoonerDevice) {
            output.qie(serialDesc, 21, self.isSpoonerDevice);
        }
        if (output.r(serialDesc, 22) || self.minRequiredBuildNumber != 0) {
            output.fD(serialDesc, 22, self.minRequiredBuildNumber);
        }
        if (!output.r(serialDesc, 23) && self.minSuggestedBuildNumber == 0) {
            return;
        }
        output.fD(serialDesc, 23, self.minSuggestedBuildNumber);
    }

    public final String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    public final String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    public final String getEncryptionPublicKey() {
        return this.encryptionPublicKey;
    }

    public final Map<String, Integer> getExperiments() {
        return this.experiments;
    }

    public final int getFirstSoftReviewTriggersFactorDivider() {
        return this.firstSoftReviewTriggersFactorDivider;
    }

    public final int getHardReviewTriggersFactor() {
        return this.hardReviewTriggersFactor;
    }

    public final int getMaxReviewRequestsPerVersion() {
        return this.maxReviewRequestsPerVersion;
    }

    public final int getMinRequiredBuildNumber() {
        return this.minRequiredBuildNumber;
    }

    public final int getMinSuggestedBuildNumber() {
        return this.minSuggestedBuildNumber;
    }

    public final int getMinTimeAfterAcceptedReviewRequest() {
        return this.minTimeAfterAcceptedReviewRequest;
    }

    public final int getMinTimeBetweenReviewRequests() {
        return this.minTimeBetweenReviewRequests;
    }

    public final String getPrivacyRequestEmail() {
        return this.privacyRequestEmail;
    }

    public final String getPrivacyRequestEmailCC() {
        return this.privacyRequestEmailCC;
    }

    public final String getPrivacyRequestUrlTemplate() {
        return this.privacyRequestUrlTemplate;
    }

    public final String getPrivacyUrl() {
        return this.privacyUrl;
    }

    public final String getPrivacyVersion() {
        return this.privacyVersion;
    }

    public final int getSoftReviewTriggersFactor() {
        return this.softReviewTriggersFactor;
    }

    public final String getTosEffectiveDate() {
        return this.tosEffectiveDate;
    }

    public final String getTosUpdateMessage() {
        return this.tosUpdateMessage;
    }

    public final String getTosUrl() {
        return this.tosUrl;
    }

    public final String getTosVersion() {
        return this.tosVersion;
    }

    public final boolean isBaselineUser() {
        return this.isBaselineUser;
    }

    public final boolean isFreeUser() {
        return this.isFreeUser;
    }

    public final boolean isSpoonerDevice() {
        return this.isSpoonerDevice;
    }

    public final void setFreeUser(boolean z2) {
        this.isFreeUser = z2;
    }

    public Settings(@Json(name = "__terms_of_service_url__") String tosUrl, @Json(name = "__privacy_notice_url__") String privacyUrl, @Json(name = "__terms_of_service_version__") String tosVersion, @Json(name = "__privacy_notice_version__") String privacyVersion, @Json(name = "__terms_of_service_effective_date__") String tosEffectiveDate, @Json(name = "__terms_of_service_update_message__") String str, @Json(name = "__is_free__") boolean z2, @Json(name = "__is_baseline__") boolean z3, @Json(name = "__experiments__") Map<String, Integer> experiments, @Json(name = "privacy_request_email") String privacyRequestEmail, @Json(name = "privacy_request_email_cc") String privacyRequestEmailCC, @Json(name = "privacy_request_url_template") String privacyRequestUrlTemplate, @Json(name = "review_soft_trigger_factor") int i2, @Json(name = "review_hard_trigger_factor") int i3, @Json(name = "review_max_requests_per_version") int i5, @Json(name = "review_min_time_between_requests") int i7, @Json(name = "review_first_soft_trigger_factor_divider") int i8, @Json(name = "review_min_time_after_accepted_review_request") int i9, @Json(name = "__encryption_algorithm__") String encryptionAlgorithm, @Json(name = "__encryption_key_id__") String encryptionKeyId, @Json(name = "__encryption_public_key__") String encryptionPublicKey, @Json(name = "is_spooner_device") boolean z4, @Json(name = "min_required_build_number") int i10, @Json(name = "min_suggested_build_number") int i11) {
        Intrinsics.checkNotNullParameter(tosUrl, "tosUrl");
        Intrinsics.checkNotNullParameter(privacyUrl, "privacyUrl");
        Intrinsics.checkNotNullParameter(tosVersion, "tosVersion");
        Intrinsics.checkNotNullParameter(privacyVersion, "privacyVersion");
        Intrinsics.checkNotNullParameter(tosEffectiveDate, "tosEffectiveDate");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(privacyRequestEmail, "privacyRequestEmail");
        Intrinsics.checkNotNullParameter(privacyRequestEmailCC, "privacyRequestEmailCC");
        Intrinsics.checkNotNullParameter(privacyRequestUrlTemplate, "privacyRequestUrlTemplate");
        Intrinsics.checkNotNullParameter(encryptionAlgorithm, "encryptionAlgorithm");
        Intrinsics.checkNotNullParameter(encryptionKeyId, "encryptionKeyId");
        Intrinsics.checkNotNullParameter(encryptionPublicKey, "encryptionPublicKey");
        this.tosUrl = tosUrl;
        this.privacyUrl = privacyUrl;
        this.tosVersion = tosVersion;
        this.privacyVersion = privacyVersion;
        this.tosEffectiveDate = tosEffectiveDate;
        this.tosUpdateMessage = str;
        this.isFreeUser = z2;
        this.isBaselineUser = z3;
        this.experiments = experiments;
        this.privacyRequestEmail = privacyRequestEmail;
        this.privacyRequestEmailCC = privacyRequestEmailCC;
        this.privacyRequestUrlTemplate = privacyRequestUrlTemplate;
        this.softReviewTriggersFactor = i2;
        this.hardReviewTriggersFactor = i3;
        this.maxReviewRequestsPerVersion = i5;
        this.minTimeBetweenReviewRequests = i7;
        this.firstSoftReviewTriggersFactorDivider = i8;
        this.minTimeAfterAcceptedReviewRequest = i9;
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.encryptionKeyId = encryptionKeyId;
        this.encryptionPublicKey = encryptionPublicKey;
        this.isSpoonerDevice = z4;
        this.minRequiredBuildNumber = i10;
        this.minSuggestedBuildNumber = i11;
    }

    public /* synthetic */ Settings(String str, String str2, String str3, String str4, String str5, String str6, boolean z2, boolean z3, Map map, String str7, String str8, String str9, int i2, int i3, int i5, int i7, int i8, int i9, String str10, String str11, String str12, boolean z4, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? "" : str4, (i12 & 16) != 0 ? "" : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? false : z2, (i12 & 128) != 0 ? false : z3, (i12 & 256) != 0 ? MapsKt.emptyMap() : map, (i12 & 512) != 0 ? "" : str7, (i12 & 1024) != 0 ? "" : str8, (i12 & 2048) != 0 ? "" : str9, (i12 & 4096) != 0 ? 10 : i2, (i12 & 8192) != 0 ? 1 : i3, (i12 & 16384) != 0 ? 5 : i5, (i12 & 32768) != 0 ? 600 : i7, (i12 & 65536) == 0 ? i8 : 1, (i12 & 131072) != 0 ? ONE_MONTH : i9, (i12 & 262144) != 0 ? "" : str10, (i12 & 524288) != 0 ? "" : str11, (i12 & 1048576) == 0 ? str12 : "", (i12 & 2097152) != 0 ? false : z4, (i12 & 4194304) != 0 ? 0 : i10, (i12 & 8388608) != 0 ? 0 : i11);
    }
}
