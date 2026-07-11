package com.alightcreative.app.motion.scene;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.caoccao.javet.exceptions.JavetError;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/alightcreative/app/motion/scene/MotionPathInfo;", "", "timeToLengthMap", "Lcom/alightcreative/app/motion/scene/KeyableFloat;", JavetError.PARAMETER_PATH, "Landroid/graphics/Path;", "pathMeasure", "Landroid/graphics/PathMeasure;", "<init>", "(Lcom/alightcreative/app/motion/scene/KeyableFloat;Landroid/graphics/Path;Landroid/graphics/PathMeasure;)V", "getTimeToLengthMap", "()Lcom/alightcreative/app/motion/scene/KeyableFloat;", "getPath", "()Landroid/graphics/Path;", "getPathMeasure", "()Landroid/graphics/PathMeasure;", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class MotionPathInfo {
    private final Path path;
    private final PathMeasure pathMeasure;
    private final KeyableFloat timeToLengthMap;

    public static /* synthetic */ MotionPathInfo copy$default(MotionPathInfo motionPathInfo, KeyableFloat keyableFloat, Path path, PathMeasure pathMeasure, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            keyableFloat = motionPathInfo.timeToLengthMap;
        }
        if ((i2 & 2) != 0) {
            path = motionPathInfo.path;
        }
        if ((i2 & 4) != 0) {
            pathMeasure = motionPathInfo.pathMeasure;
        }
        return motionPathInfo.copy(keyableFloat, path, pathMeasure);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final KeyableFloat getTimeToLengthMap() {
        return this.timeToLengthMap;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Path getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PathMeasure getPathMeasure() {
        return this.pathMeasure;
    }

    public final MotionPathInfo copy(KeyableFloat timeToLengthMap, Path path, PathMeasure pathMeasure) {
        Intrinsics.checkNotNullParameter(timeToLengthMap, "timeToLengthMap");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(pathMeasure, "pathMeasure");
        return new MotionPathInfo(timeToLengthMap, path, pathMeasure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MotionPathInfo)) {
            return false;
        }
        MotionPathInfo motionPathInfo = (MotionPathInfo) other;
        return Intrinsics.areEqual(this.timeToLengthMap, motionPathInfo.timeToLengthMap) && Intrinsics.areEqual(this.path, motionPathInfo.path) && Intrinsics.areEqual(this.pathMeasure, motionPathInfo.pathMeasure);
    }

    public int hashCode() {
        return (((this.timeToLengthMap.hashCode() * 31) + this.path.hashCode()) * 31) + this.pathMeasure.hashCode();
    }

    public String toString() {
        return "MotionPathInfo(timeToLengthMap=" + this.timeToLengthMap + ", path=" + this.path + ", pathMeasure=" + this.pathMeasure + ")";
    }

    public MotionPathInfo(KeyableFloat timeToLengthMap, Path path, PathMeasure pathMeasure) {
        Intrinsics.checkNotNullParameter(timeToLengthMap, "timeToLengthMap");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(pathMeasure, "pathMeasure");
        this.timeToLengthMap = timeToLengthMap;
        this.path = path;
        this.pathMeasure = pathMeasure;
    }

    public final Path getPath() {
        return this.path;
    }

    public final PathMeasure getPathMeasure() {
        return this.pathMeasure;
    }

    public final KeyableFloat getTimeToLengthMap() {
        return this.timeToLengthMap;
    }
}
