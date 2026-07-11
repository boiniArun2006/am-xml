package com.alightcreative.app.motion.scene.visualeffect;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class VisualEffectParserKt$readEffect$result$2 extends FunctionReferenceImpl implements Function1<String, Boolean> {
    public static final VisualEffectParserKt$readEffect$result$2 INSTANCE = new VisualEffectParserKt$readEffect$result$2();

    VisualEffectParserKt$readEffect$result$2() {
        super(1, StringsKt.class, "isNotBlank", "isNotBlank(Ljava/lang/CharSequence;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(!StringsKt.isBlank(p0));
    }
}
