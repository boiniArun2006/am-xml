package com.alightcreative.app.motion.scene.visualeffect;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class VisualEffectParserKt$readEffect$result$4 extends FunctionReferenceImpl implements Function1<String, String> {
    public static final VisualEffectParserKt$readEffect$result$4 INSTANCE = new VisualEffectParserKt$readEffect$result$4();

    VisualEffectParserKt$readEffect$result$4() {
        super(1, StringsKt.class, "trim", "trim(Ljava/lang/String;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return StringsKt.trim((CharSequence) p0).toString();
    }
}
