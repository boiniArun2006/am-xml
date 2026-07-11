package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public /* synthetic */ class SceneKt$forEachElementRecursiveWithLens$2$lens$2 extends PropertyReference1Impl {
    public static final SceneKt$forEachElementRecursiveWithLens$2$lens$2 INSTANCE = new SceneKt$forEachElementRecursiveWithLens$2$lens$2();

    public SceneKt$forEachElementRecursiveWithLens$2$lens$2() {
        super(Scene.class, "elements", "getElements()Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((Scene) obj).getElements();
    }
}
