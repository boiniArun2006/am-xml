package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J/\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020!¢\u0006\u0004\b\"\u0010#J%\u0010%\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010&J?\u0010.\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J7\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020!2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010:\u001a\u0004\b;\u0010<R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010=\u001a\u0004\b>\u00106\"\u0004\b?\u0010\u000bR\u0014\u0010B\u001a\u00020@8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b'\u0010A¨\u0006C"}, d2 = {"Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "", "Lorg/xmlpull/v1/XmlPullParser;", "xmlParser", "", "config", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "resConfig", "", "qie", "(I)V", "Landroid/content/res/Resources;", "res", "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", "set", "", "attrs", "Landroid/content/res/TypedArray;", "gh", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "typedArray", "", "attrName", "resId", "defaultValue", "KN", "(Landroid/content/res/TypedArray;Ljava/lang/String;II)I", "", "Uo", "(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F", "", "nr", "(Landroid/content/res/TypedArray;Ljava/lang/String;IZ)Z", "index", "rl", "(Landroid/content/res/TypedArray;IF)F", "t", "(Landroid/content/res/TypedArray;II)I", "xMQ", "(Landroid/content/res/TypedArray;I)Ljava/lang/String;", "defValue", c.f62177j, "Landroidx/core/content/res/ComplexColorCompat;", "J2", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Landroidx/core/content/res/ComplexColorCompat;", "Landroid/content/res/ColorStateList;", "O", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Landroid/content/res/ColorStateList;", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lorg/xmlpull/v1/XmlPullParser;", "mUb", "()Lorg/xmlpull/v1/XmlPullParser;", "I", "getConfig", "setConfig", "Landroidx/compose/ui/graphics/vector/PathParser;", "Landroidx/compose/ui/graphics/vector/PathParser;", "pathParser", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AndroidVectorParser {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final XmlPullParser xmlParser;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private int config;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final PathParser pathParser;

    public AndroidVectorParser(XmlPullParser xmlPullParser, int i2) {
        this.xmlParser = xmlPullParser;
        this.config = i2;
        this.pathParser = new PathParser();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) other;
        return Intrinsics.areEqual(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    public int hashCode() {
        return (this.xmlParser.hashCode() * 31) + Integer.hashCode(this.config);
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.xmlParser + ", config=" + this.config + ')';
    }

    private final void qie(int resConfig) {
        this.config = resConfig | this.config;
    }

    public final ComplexColorCompat J2(TypedArray typedArray, Resources.Theme theme, String attrName, int resId, int defaultValue) {
        ComplexColorCompat complexColorCompatXMQ = TypedArrayUtils.xMQ(typedArray, this.xmlParser, theme, attrName, resId, defaultValue);
        qie(typedArray.getChangingConfigurations());
        return complexColorCompatXMQ;
    }

    public final int KN(TypedArray typedArray, String attrName, int resId, int defaultValue) {
        int iGh = TypedArrayUtils.gh(typedArray, this.xmlParser, attrName, resId, defaultValue);
        qie(typedArray.getChangingConfigurations());
        return iGh;
    }

    public final ColorStateList O(TypedArray typedArray, Resources.Theme theme, String attrName, int resId) {
        ColorStateList colorStateListUo = TypedArrayUtils.Uo(typedArray, this.xmlParser, theme, attrName, resId);
        qie(typedArray.getChangingConfigurations());
        return colorStateListUo;
    }

    public final float Uo(TypedArray typedArray, String attrName, int resId, float defaultValue) {
        float fMUb = TypedArrayUtils.mUb(typedArray, this.xmlParser, attrName, resId, defaultValue);
        qie(typedArray.getChangingConfigurations());
        return fMUb;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public final boolean nr(TypedArray typedArray, String attrName, int resId, boolean defaultValue) {
        boolean zO = TypedArrayUtils.O(typedArray, this.xmlParser, attrName, resId, defaultValue);
        qie(typedArray.getChangingConfigurations());
        return zO;
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i3 & 2) != 0 ? 0 : i2);
    }

    public final TypedArray gh(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        TypedArray typedArrayIk = TypedArrayUtils.Ik(res, theme, set, attrs);
        qie(typedArrayIk.getChangingConfigurations());
        return typedArrayIk;
    }

    public final float n(TypedArray typedArray, int index, float defValue) {
        float dimension = typedArray.getDimension(index, defValue);
        qie(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float rl(TypedArray typedArray, int index, float defaultValue) {
        float f3 = typedArray.getFloat(index, defaultValue);
        qie(typedArray.getChangingConfigurations());
        return f3;
    }

    public final int t(TypedArray typedArray, int index, int defaultValue) {
        int i2 = typedArray.getInt(index, defaultValue);
        qie(typedArray.getChangingConfigurations());
        return i2;
    }

    public final String xMQ(TypedArray typedArray, int index) {
        String string = typedArray.getString(index);
        qie(typedArray.getChangingConfigurations());
        return string;
    }
}
