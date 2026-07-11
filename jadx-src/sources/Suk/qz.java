package Suk;

import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public enum qz {
    EVENT_TIME(qfEYuUHwj.eLYtkWoRKkZbb),
    EVENT_NAME("_eventName"),
    VALUE_TO_SUM("_valueToSum"),
    CONTENT_IDS("fb_content_id"),
    CONTENTS("fb_content"),
    CONTENT_TYPE("fb_content_type"),
    DESCRIPTION("fb_description"),
    LEVEL("fb_level"),
    MAX_RATING_VALUE("fb_max_rating_value"),
    NUM_ITEMS("fb_num_items"),
    PAYMENT_INFO_AVAILABLE("fb_payment_info_available"),
    REGISTRATION_METHOD("fb_registration_method"),
    SEARCH_STRING("fb_search_string"),
    SUCCESS("fb_success"),
    ORDER_ID("fb_order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("fb_currency");


    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f10107t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f10109n;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final qz n(String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            for (qz qzVar : qz.values()) {
                if (Intrinsics.areEqual(qzVar.rl(), rawValue)) {
                    return qzVar;
                }
            }
            return null;
        }
    }

    public final String rl() {
        return this.f10109n;
    }

    qz(String str) {
        this.f10109n = str;
    }
}
