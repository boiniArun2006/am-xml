package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public /* synthetic */ class SceneKt$forEachElementRecursiveWithLens$2$lens$1 extends PropertyReference1Impl {
    public static final SceneKt$forEachElementRecursiveWithLens$2$lens$1 INSTANCE = new SceneKt$forEachElementRecursiveWithLens$2$lens$1();

    public SceneKt$forEachElementRecursiveWithLens$2$lens$1() {
        super(SceneElement.class, "nestedScene", "getNestedScene()Lcom/alightcreative/app/motion/scene/Scene;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((SceneElement) obj).getNestedScene();
    }
}
