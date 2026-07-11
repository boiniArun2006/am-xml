package com.alightcreative.app.motion.scene.liveshape;

import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0012\u0010\u0012\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/alightcreative/app/motion/scene/liveshape/IShapeHandle;", "", "id", "", "getId", "()Ljava/lang/String;", "paramId", "getParamId", "type", "Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleType;", "getType", "()Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleType;", "invertX", "", "getInvertX", "()Z", "invertY", "getInvertY", "lockRatio", "getLockRatio", "style", "Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleStyle;", "getStyle", "()Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleStyle;", "icon", "Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleIcon;", "getIcon", "()Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleIcon;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IShapeHandle {
    ShapeHandleIcon getIcon();

    String getId();

    boolean getInvertX();

    boolean getInvertY();

    boolean getLockRatio();

    String getParamId();

    ShapeHandleStyle getStyle();

    ShapeHandleType getType();
}
