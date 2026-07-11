package P0j;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Regex f7566n = new Regex("\\{.*?\\}");

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpanStyle HI(SpanStyle spanStyle, SpanStyle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SpanStyle.rl(spanStyle, 0L, 0L, null, FontStyle.t(FontStyle.INSTANCE.n()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65527, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpanStyle Ik(SpanStyle spanStyle, SpanStyle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.t();
        }
        return SpanStyle.rl(spanStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, textDecoration.J2(TextDecoration.INSTANCE.rl()), null, null, null, 61439, null);
    }

    public static final AnnotatedString KN(AnnotatedString annotatedString, String tag, Dsr transformation) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        String str = "{" + tag + "}";
        String str2 = "{/" + tag + "}";
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) annotatedString, str, 0, false, 6, (Object) null);
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) annotatedString, str2, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1 && iIndexOf$default2 == -1) {
            return annotatedString;
        }
        if (iIndexOf$default2 == -1 || iIndexOf$default == -1) {
            throw new IllegalArgumentException(("Malformed string: " + ((Object) annotatedString)).toString());
        }
        if (iIndexOf$default2 <= iIndexOf$default) {
            throw new IllegalArgumentException(("Malformed string: " + ((Object) annotatedString)).toString());
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.J2(annotatedString.subSequence(0, iIndexOf$default));
        int iAz = builder.az(r(qie(ty(Z(mUb(ck(S(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65535, null), transformation.mUb()), transformation.Uo()), transformation.t()), transformation.xMQ()), transformation.J2()), transformation.nr()), transformation.O()));
        try {
            builder.KN(annotatedString.subSequence(str.length() + iIndexOf$default, iIndexOf$default2).toString());
            Unit unit = Unit.INSTANCE;
            builder.qie(iAz);
            if (transformation.KN() != null) {
                builder.n(tag, tag, iIndexOf$default, iIndexOf$default2 - str.length());
            }
            builder.J2(KN(annotatedString.subSequence(iIndexOf$default2 + str2.length(), annotatedString.length()), tag, transformation));
            return builder.ty();
        } catch (Throwable th) {
            builder.qie(iAz);
            throw th;
        }
    }

    private static final SpanStyle S(final SpanStyle spanStyle, boolean z2) {
        return (SpanStyle) w9.Wre.n(spanStyle, z2, new Function1() { // from class: P0j.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.WPU(spanStyle, (SpanStyle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpanStyle WPU(SpanStyle spanStyle, SpanStyle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.t();
        }
        return SpanStyle.rl(spanStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, textDecoration.J2(TextDecoration.INSTANCE.nr()), null, null, null, 61439, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpanStyle XQ(SpanStyle spanStyle, SpanStyle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SpanStyle.rl(spanStyle, 0L, 0L, FontWeight.INSTANCE.J2(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null);
    }

    private static final SpanStyle Z(final SpanStyle spanStyle, boolean z2) {
        return (SpanStyle) w9.Wre.n(spanStyle, z2, new Function1() { // from class: P0j.Wre
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.XQ(spanStyle, (SpanStyle) obj);
            }
        });
    }

    public static final AnnotatedString aYN(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.KN(str);
        return builder.ty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpanStyle az(SpanStyle spanStyle, Color color, SpanStyle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNull(color);
        return SpanStyle.rl(spanStyle, color.getValue(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null);
    }

    private static final SpanStyle ck(final SpanStyle spanStyle, boolean z2) {
        return (SpanStyle) w9.Wre.n(spanStyle, z2, new Function1() { // from class: P0j.Ml
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.Ik(spanStyle, (SpanStyle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpanStyle gh(SpanStyle spanStyle, SpanStyle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SpanStyle.rl(spanStyle, 0L, 0L, FontWeight.INSTANCE.n(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null);
    }

    private static final SpanStyle mUb(final SpanStyle spanStyle, boolean z2) {
        return (SpanStyle) w9.Wre.n(spanStyle, z2, new Function1() { // from class: P0j.I28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.gh(spanStyle, (SpanStyle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpanStyle o(SpanStyle spanStyle, long j2, SpanStyle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SpanStyle.rl(spanStyle, 0L, j2, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65533, null);
    }

    private static final SpanStyle qie(final SpanStyle spanStyle, final Color color) {
        return (SpanStyle) w9.Wre.n(spanStyle, color != null, new Function1() { // from class: P0j.CN3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.az(spanStyle, color, (SpanStyle) obj);
            }
        });
    }

    private static final SpanStyle r(final SpanStyle spanStyle, final long j2) {
        return (SpanStyle) w9.Wre.n(spanStyle, !TextUnit.O(j2, TextUnit.INSTANCE.n()), new Function1() { // from class: P0j.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.o(spanStyle, j2, (SpanStyle) obj);
            }
        });
    }

    private static final SpanStyle ty(final SpanStyle spanStyle, boolean z2) {
        return (SpanStyle) w9.Wre.n(spanStyle, z2, new Function1() { // from class: P0j.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.HI(spanStyle, (SpanStyle) obj);
            }
        });
    }

    public static final Regex xMQ() {
        return f7566n;
    }
}
