package androidx.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.view.NavArgument;
import androidx.view.NavDeepLink;
import androidx.view.NavOptions;
import androidx.view.common.R;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010!J7\u0010\"\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020$2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010(¨\u0006*"}, d2 = {"Landroidx/navigation/NavInflater;", "", "Landroid/content/Context;", "context", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "<init>", "(Landroid/content/Context;Landroidx/navigation/NavigatorProvider;)V", "Landroid/content/res/Resources;", "res", "Landroid/content/res/XmlResourceParser;", "parser", "Landroid/util/AttributeSet;", "attrs", "", "graphResId", "Landroidx/navigation/NavDestination;", c.f62177j, "(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;I)Landroidx/navigation/NavDestination;", "dest", "", "J2", "(Landroid/content/res/Resources;Landroidx/navigation/NavDestination;Landroid/util/AttributeSet;I)V", "Landroid/os/Bundle;", "bundle", "O", "(Landroid/content/res/Resources;Landroid/os/Bundle;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/navigation/NavArgument;", "nr", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources;I)Landroidx/navigation/NavArgument;", "Uo", "(Landroid/content/res/Resources;Landroidx/navigation/NavDestination;Landroid/util/AttributeSet;)V", "t", "(Landroid/content/res/Resources;Landroidx/navigation/NavDestination;Landroid/util/AttributeSet;Landroid/content/res/XmlResourceParser;I)V", "Landroidx/navigation/NavGraph;", "rl", "(I)Landroidx/navigation/NavGraph;", "Landroid/content/Context;", "Landroidx/navigation/NavigatorProvider;", "Companion", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavInflater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavInflater.kt\nandroidx/navigation/NavInflater\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 4 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,365:1\n1#2:366\n232#3,3:367\n232#3,3:370\n232#3,3:373\n232#3,3:376\n55#4,6:379\n*S KotlinDebug\n*F\n+ 1 NavInflater.kt\nandroidx/navigation/NavInflater\n*L\n110#1:367,3\n128#1:370,3\n144#1:373,3\n261#1:376,3\n295#1:379,6\n*E\n"})
public final class NavInflater {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final NavigatorProvider navigatorProvider;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ThreadLocal nr = new ThreadLocal();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/navigation/NavInflater$Companion;", "", "<init>", "()V", "Landroid/util/TypedValue;", "value", "Landroidx/navigation/NavType;", "navType", "expectedNavType", "", "argType", "foundType", c.f62177j, "(Landroid/util/TypedValue;Landroidx/navigation/NavType;Landroidx/navigation/NavType;Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavType;", "APPLICATION_ID_PLACEHOLDER", "Ljava/lang/String;", "TAG_ACTION", "TAG_ARGUMENT", "TAG_DEEP_LINK", "TAG_INCLUDE", "Ljava/lang/ThreadLocal;", "sTmpValue", "Ljava/lang/ThreadLocal;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NavType n(TypedValue value, NavType navType, NavType expectedNavType, String argType, String foundType) throws XmlPullParserException {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(expectedNavType, "expectedNavType");
            Intrinsics.checkNotNullParameter(foundType, "foundType");
            if (navType == null || navType == expectedNavType) {
                return navType == null ? expectedNavType : navType;
            }
            throw new XmlPullParserException("Type is " + argType + " but found " + foundType + ": " + value.data);
        }
    }

    public NavInflater(Context context, NavigatorProvider navigatorProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }

    private final void J2(Resources res, NavDestination dest, AttributeSet attrs, int graphResId) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = res.obtainAttributes(attrs, R.styleable.az);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(R.styleable.ty);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        Intrinsics.checkNotNullExpressionValue(string, "array.getString(R.stylea…uments must have a name\")");
        dest.O(string, nr(typedArrayObtainAttributes, res, graphResId));
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    private final void O(Resources res, Bundle bundle, AttributeSet attrs, int graphResId) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = res.obtainAttributes(attrs, R.styleable.az);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(R.styleable.ty);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        Intrinsics.checkNotNullExpressionValue(string, "array.getString(R.stylea…uments must have a name\")");
        NavArgument navArgumentNr = nr(typedArrayObtainAttributes, res, graphResId);
        if (navArgumentNr.getIsDefaultValuePresent()) {
            navArgumentNr.O(string, bundle);
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    private final void Uo(Resources res, NavDestination dest, AttributeSet attrs) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = res.obtainAttributes(attrs, R.styleable.f40187r);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = typedArrayObtainAttributes.getString(R.styleable.XQ);
        String string2 = typedArrayObtainAttributes.getString(R.styleable.f40186o);
        String string3 = typedArrayObtainAttributes.getString(R.styleable.f40183Z);
        if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        NavDeepLink.Builder builder = new NavDeepLink.Builder();
        if (string != null) {
            String packageName = this.context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            builder.nr(StringsKt.replace$default(string, "${applicationId}", packageName, false, 4, (Object) null));
        }
        if (string2 != null && string2.length() != 0) {
            String packageName2 = this.context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName2, "context.packageName");
            builder.rl(StringsKt.replace$default(string2, "${applicationId}", packageName2, false, 4, (Object) null));
        }
        if (string3 != null) {
            String packageName3 = this.context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName3, "context.packageName");
            builder.t(StringsKt.replace$default(string3, "${applicationId}", packageName3, false, 4, (Object) null));
        }
        dest.J2(builder.n());
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    private final NavDestination n(Resources res, XmlResourceParser parser, AttributeSet attrs, int graphResId) throws XmlPullParserException, IOException {
        int depth;
        NavigatorProvider navigatorProvider = this.navigatorProvider;
        String name = parser.getName();
        Intrinsics.checkNotNullExpressionValue(name, "parser.name");
        NavDestination navDestinationN = navigatorProvider.O(name).n();
        navDestinationN.S(this.context, attrs);
        int depth2 = parser.getDepth() + 1;
        while (true) {
            int next = parser.next();
            if (next == 1 || ((depth = parser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = parser.getName();
                if (Intrinsics.areEqual("argument", name2)) {
                    J2(res, navDestinationN, attrs, graphResId);
                } else if (Intrinsics.areEqual("deepLink", name2)) {
                    Uo(res, navDestinationN, attrs);
                } else if (Intrinsics.areEqual(FileUploadManager.f61572j, name2)) {
                    t(res, navDestinationN, attrs, parser, graphResId);
                } else {
                    Resources resources = res;
                    XmlResourceParser xmlResourceParser = parser;
                    AttributeSet attributeSet = attrs;
                    int i2 = graphResId;
                    if (Intrinsics.areEqual("include", name2) && (navDestinationN instanceof NavGraph)) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C1623R.styleable.xMQ);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                        ((NavGraph) navDestinationN).iF(rl(typedArrayObtainAttributes.getResourceId(C1623R.styleable.mUb, 0)));
                        Unit unit = Unit.INSTANCE;
                        typedArrayObtainAttributes.recycle();
                    } else if (navDestinationN instanceof NavGraph) {
                        ((NavGraph) navDestinationN).iF(n(resources, xmlResourceParser, attributeSet, i2));
                    }
                    res = resources;
                    attrs = attributeSet;
                    parser = xmlResourceParser;
                    graphResId = i2;
                }
            }
        }
        return navDestinationN;
    }

    private final NavArgument nr(TypedArray a2, Resources res, int graphResId) throws XmlPullParserException {
        NavArgument.Builder builder = new NavArgument.Builder();
        int i2 = 0;
        builder.t(a2.getBoolean(R.styleable.Ik, false));
        ThreadLocal threadLocal = nr;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        String string = a2.getString(R.styleable.ck);
        Object objQie = null;
        NavType navTypeN = string != null ? AbstractC1629n.n(NavType.INSTANCE, string, res.getResourcePackageName(graphResId)) : null;
        int i3 = R.styleable.HI;
        if (a2.getValue(i3, typedValue2)) {
            NavType navType = NavType.f40154O;
            if (navTypeN == navType) {
                int i5 = typedValue2.resourceId;
                if (i5 != 0) {
                    i2 = i5;
                } else if (typedValue2.type != 16 || typedValue2.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + navTypeN.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() + ". Must be a reference to a resource.");
                }
                objQie = Integer.valueOf(i2);
            } else {
                int i7 = typedValue2.resourceId;
                if (i7 != 0) {
                    if (navTypeN != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + navTypeN.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() + ". You must use a \"" + navType.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() + "\" type to reference other resources.");
                    }
                    navTypeN = navType;
                    objQie = Integer.valueOf(i7);
                } else if (navTypeN == NavType.Ik) {
                    objQie = a2.getString(i3);
                } else {
                    int i8 = typedValue2.type;
                    if (i8 == 3) {
                        String string2 = typedValue2.string.toString();
                        if (navTypeN == null) {
                            navTypeN = NavType.INSTANCE.rl(string2);
                        }
                        objQie = navTypeN.qie(string2);
                    } else if (i8 == 4) {
                        navTypeN = INSTANCE.n(typedValue2, navTypeN, NavType.gh, string, "float");
                        objQie = Float.valueOf(typedValue2.getFloat());
                    } else if (i8 == 5) {
                        navTypeN = INSTANCE.n(typedValue2, navTypeN, NavType.nr, string, "dimension");
                        objQie = Integer.valueOf((int) typedValue2.getDimension(res.getDisplayMetrics()));
                    } else if (i8 == 18) {
                        navTypeN = INSTANCE.n(typedValue2, navTypeN, NavType.ty, string, "boolean");
                        objQie = Boolean.valueOf(typedValue2.data != 0);
                    } else {
                        if (i8 < 16 || i8 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue2.type);
                        }
                        NavType navType2 = NavType.gh;
                        if (navTypeN == navType2) {
                            navTypeN = INSTANCE.n(typedValue2, navTypeN, navType2, string, "float");
                            objQie = Float.valueOf(typedValue2.data);
                        } else {
                            navTypeN = INSTANCE.n(typedValue2, navTypeN, NavType.nr, string, "integer");
                            objQie = Integer.valueOf(typedValue2.data);
                        }
                    }
                }
            }
        }
        if (objQie != null) {
            builder.rl(objQie);
        }
        if (navTypeN != null) {
            builder.nr(navTypeN);
        }
        return builder.n();
    }

    private final void t(Resources res, NavDestination dest, AttributeSet attrs, XmlResourceParser parser, int graphResId) throws XmlPullParserException, IOException {
        int depth;
        Context context = this.context;
        int[] NavAction = R.styleable.f40185n;
        Intrinsics.checkNotNullExpressionValue(NavAction, "NavAction");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, NavAction, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.rl, 0);
        NavAction navAction = new NavAction(typedArrayObtainStyledAttributes.getResourceId(R.styleable.f40188t, 0), null, null, 6, null);
        NavOptions.Builder builder = new NavOptions.Builder();
        builder.nr(typedArrayObtainStyledAttributes.getBoolean(R.styleable.J2, false));
        builder.qie(typedArrayObtainStyledAttributes.getBoolean(R.styleable.qie, false));
        builder.Uo(typedArrayObtainStyledAttributes.getResourceId(R.styleable.xMQ, -1), typedArrayObtainStyledAttributes.getBoolean(R.styleable.mUb, false), typedArrayObtainStyledAttributes.getBoolean(R.styleable.gh, false));
        builder.rl(typedArrayObtainStyledAttributes.getResourceId(R.styleable.nr, -1));
        builder.t(typedArrayObtainStyledAttributes.getResourceId(R.styleable.f40181O, -1));
        builder.O(typedArrayObtainStyledAttributes.getResourceId(R.styleable.Uo, -1));
        builder.J2(typedArrayObtainStyledAttributes.getResourceId(R.styleable.KN, -1));
        navAction.O(builder.n());
        Bundle bundle = new Bundle();
        int depth2 = parser.getDepth() + 1;
        while (true) {
            int next = parser.next();
            if (next == 1 || ((depth = parser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && Intrinsics.areEqual("argument", parser.getName())) {
                O(res, bundle, attrs, graphResId);
            }
        }
        if (!bundle.isEmpty()) {
            navAction.nr(bundle);
        }
        dest.WPU(resourceId, navAction);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final NavGraph rl(int graphResId) {
        int next;
        Resources res = this.context.getResources();
        XmlResourceParser xml = res.getXml(graphResId);
        Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("Exception inflating " + res.getResourceName(graphResId) + " line " + xml.getLineNumber(), e2);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        Intrinsics.checkNotNullExpressionValue(res, "res");
        Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
        NavDestination navDestinationN = n(res, xml, attrs, graphResId);
        if (navDestinationN instanceof NavGraph) {
            return (NavGraph) navDestinationN;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
