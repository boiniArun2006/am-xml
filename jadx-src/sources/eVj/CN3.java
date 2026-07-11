package eVj;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class CN3 {

    public static final class j extends ClickableSpan {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f63722n;

        j(Function0 function0) {
            this.f63722n = function0;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            this.f63722n.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(eVj.j jVar, final SpannedString spannedString, final int i2, final String str, final int i3, SpannableStringBuilder maybeColored) {
        Intrinsics.checkNotNullParameter(maybeColored, "$this$maybeColored");
        Uo(maybeColored, jVar.nr(), new Function1() { // from class: eVj.Wre
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CN3.ck(spannedString, i2, str, i3, (SpannableStringBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    private static final SpannableStringBuilder J2(SpannableStringBuilder spannableStringBuilder, boolean z2, Function1 function1) {
        if (!z2) {
            function1.invoke(spannableStringBuilder);
            return spannableStringBuilder;
        }
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    private static final SpannableStringBuilder KN(SpannableStringBuilder spannableStringBuilder, Integer num, Function1 function1) {
        if (num == null) {
            function1.invoke(spannableStringBuilder);
            return spannableStringBuilder;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(num.intValue());
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    private static final SpannableStringBuilder Uo(SpannableStringBuilder spannableStringBuilder, Function0 function0, Function1 function1) {
        if (function0 == null) {
            function1.invoke(spannableStringBuilder);
            return spannableStringBuilder;
        }
        j jVar = new j(function0);
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(jVar, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(final eVj.j jVar, final SpannedString spannedString, final int i2, final String str, final int i3, SpannableStringBuilder maybeBold) {
        Intrinsics.checkNotNullParameter(maybeBold, "$this$maybeBold");
        xMQ(maybeBold, jVar.t(), new Function1() { // from class: eVj.Ml
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CN3.ty(jVar, spannedString, i2, str, i3, (SpannableStringBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(SpannedString spannedString, int i2, String str, int i3, SpannableStringBuilder maybeClickable) {
        Intrinsics.checkNotNullParameter(maybeClickable, "$this$maybeClickable");
        maybeClickable.append(spannedString.subSequence(i2 + str.length(), i3));
        return Unit.INSTANCE;
    }

    public static final SpannedString gh(final SpannedString spannedString, String tag, final eVj.j transformation) {
        Intrinsics.checkNotNullParameter(spannedString, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        final String str = "{" + tag + "}";
        String str2 = "{/" + tag + "}";
        final int iIndexOf$default = StringsKt.indexOf$default((CharSequence) spannedString, str, 0, false, 6, (Object) null);
        final int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) spannedString, str2, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1 && iIndexOf$default2 == -1) {
            return spannedString;
        }
        if (iIndexOf$default2 == -1 || iIndexOf$default == -1) {
            throw new IllegalArgumentException(("Malformed string: " + ((Object) spannedString)).toString());
        }
        if (iIndexOf$default2 <= iIndexOf$default) {
            throw new IllegalArgumentException(("Malformed string: " + ((Object) spannedString)).toString());
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(spannedString.subSequence(0, iIndexOf$default));
        mUb(spannableStringBuilder, transformation.O(), new Function1() { // from class: eVj.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CN3.qie(transformation, spannedString, iIndexOf$default, str, iIndexOf$default2, (SpannableStringBuilder) obj);
            }
        });
        SpannedString spannedStringValueOf = SpannedString.valueOf(spannedString.subSequence(iIndexOf$default2 + str2.length(), spannedString.length()));
        Intrinsics.checkNotNullExpressionValue(spannedStringValueOf, "valueOf(...)");
        spannableStringBuilder.append((CharSequence) gh(spannedStringValueOf, tag, transformation));
        return new SpannedString(spannableStringBuilder);
    }

    private static final SpannableStringBuilder mUb(SpannableStringBuilder spannableStringBuilder, boolean z2, Function1 function1) {
        if (!z2) {
            function1.invoke(spannableStringBuilder);
            return spannableStringBuilder;
        }
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(final eVj.j jVar, final SpannedString spannedString, final int i2, final String str, final int i3, SpannableStringBuilder maybeUnderlined) {
        Intrinsics.checkNotNullParameter(maybeUnderlined, "$this$maybeUnderlined");
        J2(maybeUnderlined, jVar.n(), new Function1() { // from class: eVj.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CN3.az(jVar, spannedString, i2, str, i3, (SpannableStringBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(final eVj.j jVar, final SpannedString spannedString, final int i2, final String str, final int i3, SpannableStringBuilder maybeItalic) {
        Intrinsics.checkNotNullParameter(maybeItalic, "$this$maybeItalic");
        KN(maybeItalic, jVar.rl(), new Function1() { // from class: eVj.I28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CN3.HI(jVar, spannedString, i2, str, i3, (SpannableStringBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    private static final SpannableStringBuilder xMQ(SpannableStringBuilder spannableStringBuilder, boolean z2, Function1 function1) {
        if (!z2) {
            function1.invoke(spannableStringBuilder);
            return spannableStringBuilder;
        }
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
