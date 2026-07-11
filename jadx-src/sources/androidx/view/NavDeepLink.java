package androidx.view;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b#\u0018\u0000 \u001c2\u00020\u0001:\u0004rstuB'\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b \u0010!JC\u0010&\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b&\u0010'J1\u0010+\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b+\u0010,J3\u0010-\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u00100J\u001b\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$01H\u0002¢\u0006\u0004\b2\u00103J#\u00105\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u000104H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u000eH\u0002¢\u0006\u0004\b7\u00100J\u0017\u00109\u001a\u0002082\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b9\u0010:J/\u0010;\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0007¢\u0006\u0004\b;\u0010<J/\u0010=\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0000¢\u0006\u0004\b=\u0010<J\u0019\u0010?\u001a\u0002082\b\u0010>\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b?\u0010@J\u001a\u0010B\u001a\u00020\u001b2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u000208H\u0016¢\u0006\u0004\bD\u0010ER\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010IR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010GR\u001d\u0010X\u001a\u0004\u0018\u00010S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001b\u0010[\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010U\u001a\u0004\bY\u0010ZR'\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010U\u001a\u0004\b\\\u00103R\u0016\u0010^\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010MR/\u0010a\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u0001048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010U\u001a\u0004\b`\u00106R!\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010U\u001a\u0004\bb\u0010cR\u001d\u0010f\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010U\u001a\u0004\be\u0010IR\u001d\u0010h\u001a\u0004\u0018\u00010S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010U\u001a\u0004\bg\u0010WR\u0018\u0010i\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010GR\u001d\u0010k\u001a\u0004\u0018\u00010S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010U\u001a\u0004\bj\u0010WR*\u0010p\u001a\u00020\u001b2\u0006\u0010l\u001a\u00020\u001b8G@@X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010M\u001a\u0004\bm\u0010Z\"\u0004\bn\u0010oR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010c¨\u0006v"}, d2 = {"Landroidx/navigation/NavDeepLink;", "", "", "uriPattern", FileUploadManager.f61572j, "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "uri", "", "args", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "uriRegex", "", "Uo", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/StringBuilder;)V", "fragment", "Landroid/os/Bundle;", "bundle", "", "Landroidx/navigation/NavArgument;", "arguments", "o", "(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;)V", "Ljava/util/regex/Matcher;", "matcher", "", "Ik", "(Ljava/util/regex/Matcher;Landroid/os/Bundle;Ljava/util/Map;)Z", "Landroid/net/Uri;", "deepLink", "r", "(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z", "", "inputParams", "Landroidx/navigation/NavDeepLink$ParamQuery;", "storedParam", "E2", "(Ljava/util/List;Landroidx/navigation/NavDeepLink$ParamQuery;Landroid/os/Bundle;Ljava/util/Map;)Z", AppMeasurementSdk.ConditionalUserProperty.NAME, "value", "argument", "te", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "iF", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavArgument;)Z", "X", "()V", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()Ljava/util/Map;", "Lkotlin/Pair;", "fD", "()Lkotlin/Pair;", "e", "", "XQ", "(Ljava/lang/String;)I", "HI", "(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;", "ck", "requestedLink", "KN", "(Landroid/net/Uri;)I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", c.f62177j, "Ljava/lang/String;", "ViF", "()Ljava/lang/String;", "rl", "xMQ", "t", "Z", "nr", "Ljava/util/List;", "pathArgs", "O", "pathRegex", "Ljava/util/regex/Pattern;", "J2", "Lkotlin/Lazy;", "WPU", "()Ljava/util/regex/Pattern;", "pathPattern", "g", "()Z", "isParameterizedQuery", "aYN", "queryArgsMap", "isSingleQueryParamValueOnly", "mUb", "qie", "fragArgsAndRegex", "gh", "()Ljava/util/List;", "fragArgs", "ty", "fragRegex", "az", "fragPattern", "mimeTypeRegex", "S", "mimeTypePattern", "<set-?>", "nY", "setExactDeepLink$navigation_common_release", "(Z)V", "isExactDeepLink", "argumentsNames", "Builder", "Companion", "MimeType", "ParamQuery", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n1360#2:762\n1446#2,5:763\n1559#2:768\n1590#2,4:769\n1559#2:773\n1590#2,4:774\n1855#2,2:780\n1855#2:782\n1559#2:783\n1590#2,4:784\n1856#2:788\n215#3,2:778\n1#4:789\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n*L\n86#1:762\n86#1:763,5\n232#1:768\n232#1:769,4\n249#1:773\n249#1:774,4\n310#1:780,2\n319#1:782\n331#1:783\n331#1:784,4\n319#1:788\n271#1:778,2\n*E\n"})
public final class NavDeepLink {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final Lazy mimeTypePattern;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final Lazy queryArgsMap;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private String pathRegex;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final Lazy fragPattern;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private boolean isExactDeepLink;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final Lazy fragArgs;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final Lazy fragArgsAndRegex;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String uriPattern;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final Lazy fragRegex;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final String action;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String mimeType;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private String mimeTypeRegex;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private boolean isSingleQueryParamValueOnly;
    private static final Companion Ik = new Companion(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f40057r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f40056o = Pattern.compile("\\{(.+?)\\}");

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final List pathArgs = new ArrayList();

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Lazy pathPattern = LazyKt.lazy(new Function0<Pattern>() { // from class: androidx.navigation.NavDeepLink$pathPattern$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = this.f40073n.pathRegex;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    });

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Lazy isParameterizedQuery = LazyKt.lazy(new Function0<Boolean>() { // from class: androidx.navigation.NavDeepLink$isParameterizedQuery$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((this.f40071n.getUriPattern() == null || Uri.parse(this.f40071n.getUriPattern()).getQuery() == null) ? false : true);
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u0010B\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/navigation/NavDeepLink$Builder;", "", "<init>", "()V", "", "uriPattern", "nr", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLink$Builder;", FileUploadManager.f61572j, "rl", "mimeType", "t", "Landroidx/navigation/NavDeepLink;", c.f62177j, "()Landroidx/navigation/NavDeepLink;", "Ljava/lang/String;", "Companion", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n1#2:762\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private String uriPattern;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private String action;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private String mimeType;

        public final NavDeepLink n() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        public final Builder nr(String uriPattern) {
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }

        public final Builder rl(String action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        public final Builder t(String mimeType) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/navigation/NavDeepLink$Companion;", "", "()V", "FILL_IN_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "SCHEME_PATTERN", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0012"}, d2 = {"Landroidx/navigation/NavDeepLink$MimeType;", "", "", "mimeType", "<init>", "(Ljava/lang/String;)V", InneractiveMediationNameConsts.OTHER, "", c.f62177j, "(Landroidx/navigation/NavDeepLink$MimeType;)I", "Ljava/lang/String;", "t", "()Ljava/lang/String;", "setType", "type", "rl", "setSubType", "subType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,761:1\n731#2,9:762\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n*L\n448#1:762,9\n*E\n"})
    private static final class MimeType implements Comparable<MimeType> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private String type;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private String subType;

        public MimeType(String mimeType) {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            List<String> listSplit = new Regex("/").split(mimeType, 0);
            if (listSplit.isEmpty()) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listEmptyList = CollectionsKt.emptyList();
            }
            this.type = (String) listEmptyList.get(0);
            this.subType = (String) listEmptyList.get(1);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(MimeType other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i2 = Intrinsics.areEqual(this.type, other.type) ? 2 : 0;
            return Intrinsics.areEqual(this.subType, other.subType) ? i2 + 1 : i2;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final String getSubType() {
            return this.subType;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/navigation/NavDeepLink$ParamQuery;", "", "<init>", "()V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", c.f62177j, "(Ljava/lang/String;)V", "Ljava/lang/String;", "t", "()Ljava/lang/String;", "nr", "paramRegex", "", "rl", "Ljava/util/List;", "()Ljava/util/List;", "arguments", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class ParamQuery {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private String paramRegex;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final List arguments = new ArrayList();

        public final void n(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.arguments.add(name);
        }

        public final void nr(String str) {
            this.paramRegex = str;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final List getArguments() {
            return this.arguments;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getParamRegex() {
            return this.paramRegex;
        }
    }

    private final boolean E2(List inputParams, ParamQuery storedParam, Bundle bundle, Map arguments) {
        Object objValueOf;
        Bundle bundleN = BundleKt.n(new Pair[0]);
        Iterator it = storedParam.getArguments().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            NavArgument navArgument = (NavArgument) arguments.get(str);
            NavType type = navArgument != null ? navArgument.getType() : null;
            if ((type instanceof CollectionNavType) && !navArgument.getIsDefaultValuePresent()) {
                type.KN(bundleN, str, ((CollectionNavType) type).gh());
            }
        }
        Iterator it2 = inputParams.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            String paramRegex = storedParam.getParamRegex();
            Matcher matcher = paramRegex != null ? Pattern.compile(paramRegex, 32).matcher(str2) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            List arguments2 = storedParam.getArguments();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments2, 10));
            int i2 = 0;
            for (Object obj : arguments2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str3 = (String) obj;
                String strGroup = matcher.group(i3);
                if (strGroup == null) {
                    strGroup = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(strGroup, "argMatcher.group(index + 1) ?: \"\"");
                }
                NavArgument navArgument2 = (NavArgument) arguments.get(str3);
                try {
                    if (bundleN.containsKey(str3)) {
                        objValueOf = Boolean.valueOf(iF(bundleN, str3, strGroup, navArgument2));
                    } else {
                        te(bundleN, str3, strGroup, navArgument2);
                        objValueOf = Unit.INSTANCE;
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = Unit.INSTANCE;
                }
                arrayList.add(objValueOf);
                i2 = i3;
            }
        }
        bundle.putAll(bundleN);
        return true;
    }

    public boolean equals(Object other) {
        if (other != null && (other instanceof NavDeepLink)) {
            NavDeepLink navDeepLink = (NavDeepLink) other;
            if (Intrinsics.areEqual(this.uriPattern, navDeepLink.uriPattern) && Intrinsics.areEqual(this.action, navDeepLink.action) && Intrinsics.areEqual(this.mimeType, navDeepLink.mimeType)) {
                return true;
            }
        }
        return false;
    }

    private final boolean Ik(Matcher matcher, Bundle bundle, Map arguments) {
        List list = this.pathArgs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i3));
            NavArgument navArgument = (NavArgument) arguments.get(str);
            try {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                te(bundle, str, value, navArgument);
                arrayList.add(Unit.INSTANCE);
                i2 = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final Pattern S() {
        return (Pattern) this.mimeTypePattern.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map T() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (g()) {
            Uri uri = Uri.parse(this.uriPattern);
            for (String paramName : uri.getQueryParameterNames()) {
                StringBuilder sb = new StringBuilder();
                List<String> queryParams = uri.getQueryParameters(paramName);
                if (queryParams.size() > 1) {
                    throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.uriPattern + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                Intrinsics.checkNotNullExpressionValue(queryParams, "queryParams");
                String queryParam = (String) CollectionsKt.firstOrNull((List) queryParams);
                if (queryParam == null) {
                    this.isSingleQueryParamValueOnly = true;
                    queryParam = paramName;
                }
                Matcher matcher = f40056o.matcher(queryParam);
                ParamQuery paramQuery = new ParamQuery();
                int iEnd = 0;
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNull(strGroup, "null cannot be cast to non-null type kotlin.String");
                    paramQuery.n(strGroup);
                    Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                    String strSubstring = queryParam.substring(iEnd, matcher.start());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    sb.append(Pattern.quote(strSubstring));
                    sb.append("(.+?)?");
                    iEnd = matcher.end();
                }
                if (iEnd < queryParam.length()) {
                    Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                    String strSubstring2 = queryParam.substring(iEnd);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    sb.append(Pattern.quote(strSubstring2));
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "argRegex.toString()");
                paramQuery.nr(StringsKt.replace$default(string, ".*", "\\E.*\\Q", false, 4, (Object) null));
                Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                linkedHashMap.put(paramName, paramQuery);
            }
        }
        return linkedHashMap;
    }

    private final void Uo(String uri, List args, StringBuilder uriRegex) {
        Matcher matcher = f40056o.matcher(uri);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            Intrinsics.checkNotNull(strGroup, "null cannot be cast to non-null type kotlin.String");
            args.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = uri.substring(iEnd, matcher.start());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                uriRegex.append(Pattern.quote(strSubstring));
            }
            uriRegex.append("([^/]*?|)");
            iEnd = matcher.end();
        }
        if (iEnd < uri.length()) {
            String strSubstring2 = uri.substring(iEnd);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            uriRegex.append(Pattern.quote(strSubstring2));
        }
    }

    private final Pattern WPU() {
        return (Pattern) this.pathPattern.getValue();
    }

    private final void X() {
        if (this.uriPattern == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!f40057r.matcher(this.uriPattern).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.uriPattern);
        matcher.find();
        boolean z2 = false;
        String strSubstring = this.uriPattern.substring(0, matcher.start());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Uo(strSubstring, this.pathArgs, sb);
        if (!StringsKt.contains$default((CharSequence) sb, (CharSequence) ".*", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) sb, (CharSequence) "([^/]+?)", false, 2, (Object) null)) {
            z2 = true;
        }
        this.isExactDeepLink = z2;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uriRegex.toString()");
        this.pathRegex = StringsKt.replace$default(string, ".*", "\\E.*\\Q", false, 4, (Object) null);
    }

    private final Map aYN() {
        return (Map) this.queryArgsMap.getValue();
    }

    private final Pattern az() {
        return (Pattern) this.fragPattern.getValue();
    }

    private final void e() {
        if (this.mimeType == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.mimeType).matches()) {
            throw new IllegalArgumentException(("The given mimeType " + this.mimeType + " does not match to required \"type/subtype\" format").toString());
        }
        MimeType mimeType = new MimeType(this.mimeType);
        this.mimeTypeRegex = StringsKt.replace$default("^(" + mimeType.getType() + "|[*]+)/(" + mimeType.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair fD() {
        String str = this.uriPattern;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.uriPattern).getFragment();
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNull(fragment);
        Uo(fragment, arrayList, sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "fragRegex.toString()");
        return TuplesKt.to(arrayList, string);
    }

    private final boolean g() {
        return ((Boolean) this.isParameterizedQuery.getValue()).booleanValue();
    }

    private final List gh() {
        return (List) this.fragArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair qie() {
        return (Pair) this.fragArgsAndRegex.getValue();
    }

    private final void te(Bundle bundle, String name, String value, NavArgument argument) {
        if (argument != null) {
            argument.getType().nr(bundle, name, value);
        } else {
            bundle.putString(name, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String ty() {
        return (String) this.fragRegex.getValue();
    }

    public final Bundle HI(Uri deepLink, Map arguments) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Pattern patternWPU = WPU();
        Matcher matcher = patternWPU != null ? patternWPU.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        final Bundle bundle = new Bundle();
        if (!Ik(matcher, bundle, arguments)) {
            return null;
        }
        if (g() && !r(deepLink, bundle, arguments)) {
            return null;
        }
        o(deepLink.getFragment(), bundle, arguments);
        if (NavArgumentKt.n(arguments, new Function1<String, Boolean>() { // from class: androidx.navigation.NavDeepLink$getMatchingArguments$missingRequiredArguments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String argName) {
                Intrinsics.checkNotNullParameter(argName, "argName");
                return Boolean.valueOf(!bundle.containsKey(argName));
            }
        }).isEmpty()) {
            return bundle;
        }
        return null;
    }

    public final int KN(Uri requestedLink) {
        if (requestedLink == null || this.uriPattern == null) {
            return 0;
        }
        List<String> requestedPathSegments = requestedLink.getPathSegments();
        List<String> uriPathSegments = Uri.parse(this.uriPattern).getPathSegments();
        Intrinsics.checkNotNullExpressionValue(requestedPathSegments, "requestedPathSegments");
        Intrinsics.checkNotNullExpressionValue(uriPathSegments, "uriPathSegments");
        return CollectionsKt.intersect(requestedPathSegments, uriPathSegments).size();
    }

    /* JADX INFO: renamed from: ViF, reason: from getter */
    public final String getUriPattern() {
        return this.uriPattern;
    }

    public final int XQ(String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        if (this.mimeType == null) {
            return -1;
        }
        Pattern patternS = S();
        Intrinsics.checkNotNull(patternS);
        if (patternS.matcher(mimeType).matches()) {
            return new MimeType(this.mimeType).compareTo(new MimeType(mimeType));
        }
        return -1;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final Bundle ck(Uri deepLink, Map arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (deepLink != null) {
            Pattern patternWPU = WPU();
            Matcher matcher = patternWPU != null ? patternWPU.matcher(deepLink.toString()) : null;
            if (matcher != null && matcher.matches()) {
                Ik(matcher, bundle, arguments);
                if (g()) {
                    r(deepLink, bundle, arguments);
                }
            }
        }
        return bundle;
    }

    public int hashCode() {
        String str = this.uriPattern;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mimeType;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final List mUb() {
        List list = this.pathArgs;
        Collection collectionValues = aYN().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((ParamQuery) it.next()).getArguments());
        }
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) list, (Iterable) arrayList), (Iterable) gh());
    }

    /* JADX INFO: renamed from: nY, reason: from getter */
    public final boolean getIsExactDeepLink() {
        return this.isExactDeepLink;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public NavDeepLink(String str, String str2, String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.queryArgsMap = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Map<String, ParamQuery>>() { // from class: androidx.navigation.NavDeepLink$queryArgsMap$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Map invoke() {
                return this.f40074n.T();
            }
        });
        this.fragArgsAndRegex = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Pair<? extends List<String>, ? extends String>>() { // from class: androidx.navigation.NavDeepLink$fragArgsAndRegex$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Pair invoke() {
                return this.f40067n.fD();
            }
        });
        this.fragArgs = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<List<String>>() { // from class: androidx.navigation.NavDeepLink$fragArgs$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<String> invoke() {
                List<String> list;
                Pair pairQie = this.f40066n.qie();
                return (pairQie == null || (list = (List) pairQie.getFirst()) == null) ? new ArrayList() : list;
            }
        });
        this.fragRegex = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<String>() { // from class: androidx.navigation.NavDeepLink$fragRegex$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                Pair pairQie = this.f40069n.qie();
                if (pairQie != null) {
                    return (String) pairQie.getSecond();
                }
                return null;
            }
        });
        this.fragPattern = LazyKt.lazy(new Function0<Pattern>() { // from class: androidx.navigation.NavDeepLink$fragPattern$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Pattern invoke() {
                String strTy = this.f40068n.ty();
                if (strTy != null) {
                    return Pattern.compile(strTy, 2);
                }
                return null;
            }
        });
        this.mimeTypePattern = LazyKt.lazy(new Function0<Pattern>() { // from class: androidx.navigation.NavDeepLink$mimeTypePattern$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Pattern invoke() {
                String str4 = this.f40072n.mimeTypeRegex;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            }
        });
        X();
        e();
    }

    private final boolean iF(Bundle bundle, String name, String value, NavArgument argument) {
        if (!bundle.containsKey(name)) {
            return true;
        }
        if (argument != null) {
            NavType type = argument.getType();
            type.O(bundle, name, value, type.n(bundle, name));
            return false;
        }
        return false;
    }

    private final void o(String fragment, Bundle bundle, Map arguments) {
        Matcher matcher;
        Pattern patternAz = az();
        if (patternAz != null) {
            matcher = patternAz.matcher(String.valueOf(fragment));
        } else {
            matcher = null;
        }
        if (matcher != null && matcher.matches()) {
            List listGh = gh();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listGh, 10));
            int i2 = 0;
            for (Object obj : listGh) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                String value = Uri.decode(matcher.group(i3));
                NavArgument navArgument = (NavArgument) arguments.get(str);
                try {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    te(bundle, str, value, navArgument);
                    arrayList.add(Unit.INSTANCE);
                    i2 = i3;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    private final boolean r(Uri deepLink, Bundle bundle, Map arguments) {
        String query;
        for (Map.Entry entry : aYN().entrySet()) {
            String str = (String) entry.getKey();
            ParamQuery paramQuery = (ParamQuery) entry.getValue();
            List<String> inputParams = deepLink.getQueryParameters(str);
            if (this.isSingleQueryParamValueOnly && (query = deepLink.getQuery()) != null && !Intrinsics.areEqual(query, deepLink.toString())) {
                inputParams = CollectionsKt.listOf(query);
            }
            Intrinsics.checkNotNullExpressionValue(inputParams, "inputParams");
            if (!E2(inputParams, paramQuery, bundle, arguments)) {
                return false;
            }
        }
        return true;
    }
}
