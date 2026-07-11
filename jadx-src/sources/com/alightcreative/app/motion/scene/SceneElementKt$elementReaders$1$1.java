package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class SceneElementKt$elementReaders$1$1 extends FunctionReferenceImpl implements Function3<String, XmlPullParser, Boolean, SceneElement> {
    SceneElementKt$elementReaders$1$1(Object obj) {
        super(3, obj, SceneElementType.class, "unserializeElement", "unserializeElement(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Z)Lcom/alightcreative/app/motion/scene/SceneElement;", 0);
    }

    public final SceneElement invoke(String str, XmlPullParser p1, boolean z2) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        return ((SceneElementType) this.receiver).unserializeElement(str, p1, z2);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ SceneElement invoke(String str, XmlPullParser xmlPullParser, Boolean bool) {
        return invoke(str, xmlPullParser, bool.booleanValue());
    }
}
