package com.bendingspoons.legal.privacy;

import K0.aC;
import Pr.Ml;
import Pr.n;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.time.Kw.znsSxz;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Tracker {
    public static final int $stable = 8;
    private final String analyticsName;
    private final Ml category;
    private final String description;
    private boolean isEnabled;
    private final String name;
    private final List<Pr.j> privacyPolicyEntries;
    private final j retentionDuration;
    private final Function1<Boolean, Unit> setActive;

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$Adjust;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "", "isActive", "Lkotlin/Function1;", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adjust extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "Adjust";

        public /* synthetic */ Adjust(Context context, String str, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Adjust(Context context, String str, boolean z2, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.nY);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, new j(3, n.f7849n), CollectionsKt.listOf(new Pr.j("https://www.adjust.com/terms/privacy-policy/", null, 2, null)), z2, setActive, null);
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$AppLovin;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "", "isActive", "Lkotlin/Function1;", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AppLovin extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "AppLovin";

        public /* synthetic */ AppLovin(Context context, String str, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public AppLovin(Context context, String str, boolean z2, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.iF, NAME);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, j.f51388t.n(), CollectionsKt.listOf(new Pr.j("https://www.applovin.com/privacy/", null, 2, null)), z2, setActive, null);
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$FirebaseAnalytics;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "", "isActive", "Lkotlin/Function1;", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FirebaseAnalytics extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "Firebase (Analytics)";

        public /* synthetic */ FirebaseAnalytics(Context context, String str, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? false : z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FirebaseAnalytics(Context context, String str, boolean z2, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7846t;
            String string = context.getString(aC.ViF);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, new j(3, n.f7849n), CollectionsKt.listOf(new Pr.j("https://policies.google.com/privacy", null, 2, null)), z2, setActive, null);
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$FirebaseProfiling;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "", "isActive", "Lkotlin/Function1;", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FirebaseProfiling extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "Firebase (Profiling)";

        public /* synthetic */ FirebaseProfiling(Context context, String str, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? false : z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FirebaseProfiling(Context context, String str, boolean z2, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.te);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, new j(3, n.f7849n), CollectionsKt.listOf(new Pr.j("https://policies.google.com/privacy", null, 2, null)), z2, setActive, null);
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$Fyber;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "", "isActive", "Lkotlin/Function1;", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Fyber extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "Fyber";

        public /* synthetic */ Fyber(Context context, String str, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Fyber(Context context, String str, boolean z2, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.iF, NAME);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, j.f51388t.n(), CollectionsKt.listOf(new Pr.j("https://www.digitalturbine.com/fyber-services-privacy-statement", null, 2, null)), z2, setActive, null);
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$GoogleMobileAds;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "", "isActive", "Lkotlin/Function1;", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoogleMobileAds extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "Google Mobile Ads SDK";

        public /* synthetic */ GoogleMobileAds(Context context, String str, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public GoogleMobileAds(Context context, String str, boolean z2, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.iF, NAME);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, j.f51388t.n(), CollectionsKt.listOf(new Pr.j("https://policies.google.com/privacy", null, 2, null)), z2, setActive, null);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\rB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$InMobi;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "Lkotlin/Function1;", "", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InMobi extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "InMobi";

        public /* synthetic */ InMobi(Context context, String str, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public InMobi(Context context, String str, Function1<? super Boolean, Unit> function1) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(function1, znsSxz.aaJiQ);
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.iF, NAME);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, j.f51388t.n(), CollectionsKt.listOf(new Pr.j("https://www.inmobi.com/privacy-policy", null, 2, null)), true, function1, null);
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\rB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$IronSource;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "Lkotlin/Function1;", "", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IronSource extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "IronSource";

        public /* synthetic */ IronSource(Context context, String str, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public IronSource(Context context, String str, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.iF, NAME);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, j.f51388t.n(), CollectionsKt.listOf(new Pr.j("https://developers.is.com/ironsource-mobile/air/ironsource-mobile-privacy-policy/", null, 2, null)), true, setActive, null);
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$MetaAudienceNetwork;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "", "isActive", "Lkotlin/Function1;", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MetaAudienceNetwork extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "Meta Audience Network";

        public /* synthetic */ MetaAudienceNetwork(Context context, String str, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public MetaAudienceNetwork(Context context, String str, boolean z2, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.iF, NAME);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, j.f51388t.n(), CollectionsKt.listOf(new Pr.j("https://www.facebook.com/privacy/policy", null, 2, null)), z2, setActive, null);
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$Mintegral;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "", "isActive", "Lkotlin/Function1;", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Mintegral extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "Mintegral";

        public /* synthetic */ Mintegral(Context context, String str, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Mintegral(Context context, String str, boolean z2, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.iF, NAME);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, j.f51388t.n(), CollectionsKt.listOf(new Pr.j("https://www.mintegral.com/en/privacy#privacy-policy-of-the-mintegral-services", null, 2, null)), z2, setActive, null);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$MobileFuse;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "", "isActive", "Lkotlin/Function1;", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MobileFuse extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "MobileFuse";

        public /* synthetic */ MobileFuse(Context context, String str, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public MobileFuse(Context context, String str, boolean z2, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, jhotmBbwMbr.oqF);
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.iF, NAME);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, j.f51388t.n(), CollectionsKt.listOf(new Pr.j("https://mobilefuse.com/privacy-policy", null, 2, null)), z2, setActive, null);
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$Pangle;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "", "isActive", "Lkotlin/Function1;", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Pangle extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "Pangle";

        public /* synthetic */ Pangle(Context context, String str, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Pangle(Context context, String str, boolean z2, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.iF, NAME);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, j.f51388t.n(), CollectionsKt.listOf(new Pr.j("https://www.pangleglobal.com/privacy", null, 2, null)), z2, setActive, null);
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$PicoProfiling;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "appName", "customAnalyticsName", "", "isProfilingTrackingEnabled", "Lkotlin/Function1;", "", "setProfilingTrackingEnabled", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PicoProfiling extends Tracker {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.bendingspoons.legal.privacy.Tracker$PicoProfiling$j, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String n(String appName) {
                Intrinsics.checkNotNullParameter(appName, "appName");
                return appName + " SDK (Profiling)";
            }
        }

        public /* synthetic */ PicoProfiling(Context context, String str, String str2, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, str, (i2 & 4) != 0 ? null : str2, z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PicoProfiling(Context context, String appName, String str, boolean z2, Function1<? super Boolean, Unit> setProfilingTrackingEnabled) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appName, "appName");
            Intrinsics.checkNotNullParameter(setProfilingTrackingEnabled, "setProfilingTrackingEnabled");
            Companion companion = INSTANCE;
            String strN = companion.n(appName);
            String strN2 = str == null ? companion.n(appName) : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.f4816g);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(strN, strN2, ml, string, new j(3, n.f7849n), null, z2, setProfilingTrackingEnabled, 32, null);
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$Smaato;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "", "isActive", "Lkotlin/Function1;", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Smaato extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "Smaato";

        public /* synthetic */ Smaato(Context context, String str, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Smaato(Context context, String str, boolean z2, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.iF, NAME);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, j.f51388t.n(), CollectionsKt.listOf(new Pr.j("https://www.smaato.com/privacy/", null, 2, null)), z2, setActive, null);
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$Unity;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "", "isActive", "Lkotlin/Function1;", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unity extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "Unity";

        public /* synthetic */ Unity(Context context, String str, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Unity(Context context, String str, boolean z2, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.iF, NAME);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, j.f51388t.n(), CollectionsKt.listOf(new Pr.j("https://unity.com/legal/game-player-and-app-user-privacy-policy", null, 2, null)), z2, setActive, null);
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$Verve;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "", "isActive", "Lkotlin/Function1;", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Verve extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "Verve";

        public /* synthetic */ Verve(Context context, String str, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Verve(Context context, String str, boolean z2, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? NAME : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.iF, NAME);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(NAME, str2, ml, string, j.f51388t.n(), CollectionsKt.listOf(new Pr.j("https://pubnative.net/privacy-notice/", null, 2, null)), z2, setActive, null);
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/legal/privacy/Tracker$Vungle;", "Lcom/bendingspoons/legal/privacy/Tracker;", "Landroid/content/Context;", "context", "", "customAnalyticsName", "", "isActive", "Lkotlin/Function1;", "", "setActive", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Companion", "j", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Vungle extends Tracker {
        public static final int $stable = 0;
        public static final String NAME = "Vungle";

        public /* synthetic */ Vungle(Context context, String str, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : str, z2, function1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Vungle(Context context, String str, boolean z2, Function1<? super Boolean, Unit> setActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(setActive, "setActive");
            String str2 = str == null ? "Vungle" : str;
            Ml ml = Ml.f7843O;
            String string = context.getString(aC.iF, "Vungle");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super("Vungle", str2, ml, string, j.f51388t.n(), CollectionsKt.listOf(new Pr.j("https://vungle.com/privacy/", null, 2, null)), z2, setActive, null);
        }
    }

    public /* synthetic */ Tracker(String str, String str2, Ml ml, String str3, j jVar, List list, boolean z2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, ml, str3, jVar, list, z2, function1);
    }

    private Tracker(String str, String str2, Ml ml, String str3, j jVar, List list, boolean z2, Function1 function1) {
        this.name = str;
        this.analyticsName = str2;
        this.category = ml;
        this.description = str3;
        this.retentionDuration = jVar;
        this.privacyPolicyEntries = list;
        this.setActive = function1;
        this.isEnabled = z2;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final Ml getCategory() {
        return this.category;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Pr.j> getPrivacyPolicyEntries() {
        return this.privacyPolicyEntries;
    }

    public final j getRetentionDuration() {
        return this.retentionDuration;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(boolean z2) {
        if (z2 == this.isEnabled) {
            return;
        }
        this.isEnabled = z2;
        this.setActive.invoke(Boolean.valueOf(z2));
    }

    public /* synthetic */ Tracker(String str, String str2, Ml ml, String str3, j jVar, List list, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? str : str2, ml, str3, jVar, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? false : z2, function1, null);
    }
}
