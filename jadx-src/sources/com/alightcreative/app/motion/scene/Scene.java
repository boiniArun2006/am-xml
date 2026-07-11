package com.alightcreative.app.motion.scene;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b=\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0015\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b$\u0010%J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u000fHÆ\u0003J\t\u0010O\u001a\u00020\u0011HÆ\u0003J\t\u0010P\u001a\u00020\u0013HÆ\u0003J\u0015\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J\t\u0010R\u001a\u00020\u0018HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u001dHÆ\u0003J\t\u0010W\u001a\u00020\u001fHÆ\u0003J\u0015\u0010X\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0015HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jñ\u0001\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u00152\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010[\u001a\u00020\u001d2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020\u0005HÖ\u0001J\t\u0010^\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0015¢\u0006\b\n\u0000\u001a\u0004\bB\u00108R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010'R\u0011\u0010D\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010)¨\u0006_"}, d2 = {"Lcom/alightcreative/app/motion/scene/Scene;", "", "title", "", "formatVersion", "", "width", "height", "exportWidth", "exportHeight", "elements", "", "Lcom/alightcreative/app/motion/scene/SceneElement;", "framesPerHundredSeconds", "background", "Lcom/alightcreative/app/motion/scene/SolidColor;", "precompose", "Lcom/alightcreative/app/motion/scene/PrecomposeType;", "type", "Lcom/alightcreative/app/motion/scene/SceneType;", "bookmarks", "", "Lcom/alightcreative/app/motion/scene/SceneBookmark;", "reTimingMethod", "Lcom/alightcreative/app/motion/scene/ReTimingMethod;", "reTimingInMark", "reTimingOutMark", "thumbnailTime", "reTimingAdaptFrameRate", "", "modifiedTime", "", "mediaInfo", "Landroid/net/Uri;", "Lcom/alightcreative/app/motion/scene/MediaUriInfo;", "templateLink", "<init>", "(Ljava/lang/String;IIIIILjava/util/List;ILcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/PrecomposeType;Lcom/alightcreative/app/motion/scene/SceneType;Ljava/util/Map;Lcom/alightcreative/app/motion/scene/ReTimingMethod;IIIZJLjava/util/Map;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getFormatVersion", "()I", "getWidth", "getHeight", "getExportWidth", "getExportHeight", "getElements", "()Ljava/util/List;", "getFramesPerHundredSeconds", "getBackground", "()Lcom/alightcreative/app/motion/scene/SolidColor;", "getPrecompose", "()Lcom/alightcreative/app/motion/scene/PrecomposeType;", "getType", "()Lcom/alightcreative/app/motion/scene/SceneType;", "getBookmarks", "()Ljava/util/Map;", "getReTimingMethod", "()Lcom/alightcreative/app/motion/scene/ReTimingMethod;", "getReTimingInMark", "getReTimingOutMark", "getThumbnailTime", "getReTimingAdaptFrameRate", "()Z", "getModifiedTime", "()J", "getMediaInfo", "getTemplateLink", "totalTime", "getTotalTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScene.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scene.kt\ncom/alightcreative/app/motion/scene/Scene\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1120:1\n1971#2,14:1121\n*S KotlinDebug\n*F\n+ 1 Scene.kt\ncom/alightcreative/app/motion/scene/Scene\n*L\n88#1:1121,14\n*E\n"})
public final /* data */ class Scene {
    public static final int $stable = 8;
    private final SolidColor background;
    private final Map<Integer, SceneBookmark> bookmarks;
    private final List<SceneElement> elements;
    private final int exportHeight;
    private final int exportWidth;
    private final int formatVersion;
    private final int framesPerHundredSeconds;
    private final int height;
    private final Map<Uri, MediaUriInfo> mediaInfo;
    private final long modifiedTime;
    private final PrecomposeType precompose;
    private final boolean reTimingAdaptFrameRate;
    private final int reTimingInMark;
    private final ReTimingMethod reTimingMethod;
    private final int reTimingOutMark;
    private final String templateLink;
    private final int thumbnailTime;
    private final String title;
    private final int totalTime;
    private final SceneType type;
    private final int width;

    public Scene(String title, int i2, int i3, int i5, int i7, int i8, List<SceneElement> elements, int i9, SolidColor background, PrecomposeType precompose, SceneType type, Map<Integer, SceneBookmark> bookmarks, ReTimingMethod reTimingMethod, int i10, int i11, int i12, boolean z2, long j2, Map<Uri, MediaUriInfo> mediaInfo, String str) {
        Object obj;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(precompose, "precompose");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(bookmarks, "bookmarks");
        Intrinsics.checkNotNullParameter(reTimingMethod, "reTimingMethod");
        Intrinsics.checkNotNullParameter(mediaInfo, "mediaInfo");
        this.title = title;
        this.formatVersion = i2;
        this.width = i3;
        this.height = i5;
        this.exportWidth = i7;
        this.exportHeight = i8;
        this.elements = elements;
        this.framesPerHundredSeconds = i9;
        this.background = background;
        this.precompose = precompose;
        this.type = type;
        this.bookmarks = bookmarks;
        this.reTimingMethod = reTimingMethod;
        this.reTimingInMark = i10;
        this.reTimingOutMark = i11;
        this.thumbnailTime = i12;
        this.reTimingAdaptFrameRate = z2;
        this.modifiedTime = j2;
        this.mediaInfo = mediaInfo;
        this.templateLink = str;
        Iterator<T> it = elements.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int endTime = ((SceneElement) next).getEndTime();
                do {
                    Object next2 = it.next();
                    int endTime2 = ((SceneElement) next2).getEndTime();
                    if (endTime < endTime2) {
                        next = next2;
                        endTime = endTime2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        SceneElement sceneElement = (SceneElement) obj;
        this.totalTime = sceneElement != null ? sceneElement.getEndTime() : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Scene copy$default(Scene scene, String str, int i2, int i3, int i5, int i7, int i8, List list, int i9, SolidColor solidColor, PrecomposeType precomposeType, SceneType sceneType, Map map, ReTimingMethod reTimingMethod, int i10, int i11, int i12, boolean z2, long j2, Map map2, String str2, int i13, Object obj) {
        String str3 = (i13 & 1) != 0 ? scene.title : str;
        return scene.copy(str3, (i13 & 2) != 0 ? scene.formatVersion : i2, (i13 & 4) != 0 ? scene.width : i3, (i13 & 8) != 0 ? scene.height : i5, (i13 & 16) != 0 ? scene.exportWidth : i7, (i13 & 32) != 0 ? scene.exportHeight : i8, (i13 & 64) != 0 ? scene.elements : list, (i13 & 128) != 0 ? scene.framesPerHundredSeconds : i9, (i13 & 256) != 0 ? scene.background : solidColor, (i13 & 512) != 0 ? scene.precompose : precomposeType, (i13 & 1024) != 0 ? scene.type : sceneType, (i13 & 2048) != 0 ? scene.bookmarks : map, (i13 & 4096) != 0 ? scene.reTimingMethod : reTimingMethod, (i13 & 8192) != 0 ? scene.reTimingInMark : i10, (i13 & 16384) != 0 ? scene.reTimingOutMark : i11, (i13 & 32768) != 0 ? scene.thumbnailTime : i12, (i13 & 65536) != 0 ? scene.reTimingAdaptFrameRate : z2, (i13 & 131072) != 0 ? scene.modifiedTime : j2, (i13 & 262144) != 0 ? scene.mediaInfo : map2, (i13 & 524288) != 0 ? scene.templateLink : str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final PrecomposeType getPrecompose() {
        return this.precompose;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SceneType getType() {
        return this.type;
    }

    public final Map<Integer, SceneBookmark> component12() {
        return this.bookmarks;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ReTimingMethod getReTimingMethod() {
        return this.reTimingMethod;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getReTimingInMark() {
        return this.reTimingInMark;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getReTimingOutMark() {
        return this.reTimingOutMark;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getThumbnailTime() {
        return this.thumbnailTime;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getReTimingAdaptFrameRate() {
        return this.reTimingAdaptFrameRate;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public final Map<Uri, MediaUriInfo> component19() {
        return this.mediaInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFormatVersion() {
        return this.formatVersion;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTemplateLink() {
        return this.templateLink;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getExportWidth() {
        return this.exportWidth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getExportHeight() {
        return this.exportHeight;
    }

    public final List<SceneElement> component7() {
        return this.elements;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFramesPerHundredSeconds() {
        return this.framesPerHundredSeconds;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SolidColor getBackground() {
        return this.background;
    }

    public final Scene copy(String title, int formatVersion, int width, int height, int exportWidth, int exportHeight, List<SceneElement> elements, int framesPerHundredSeconds, SolidColor background, PrecomposeType precompose, SceneType type, Map<Integer, SceneBookmark> bookmarks, ReTimingMethod reTimingMethod, int reTimingInMark, int reTimingOutMark, int thumbnailTime, boolean reTimingAdaptFrameRate, long modifiedTime, Map<Uri, MediaUriInfo> mediaInfo, String templateLink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(precompose, "precompose");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(bookmarks, "bookmarks");
        Intrinsics.checkNotNullParameter(reTimingMethod, "reTimingMethod");
        Intrinsics.checkNotNullParameter(mediaInfo, "mediaInfo");
        return new Scene(title, formatVersion, width, height, exportWidth, exportHeight, elements, framesPerHundredSeconds, background, precompose, type, bookmarks, reTimingMethod, reTimingInMark, reTimingOutMark, thumbnailTime, reTimingAdaptFrameRate, modifiedTime, mediaInfo, templateLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Scene)) {
            return false;
        }
        Scene scene = (Scene) other;
        return Intrinsics.areEqual(this.title, scene.title) && this.formatVersion == scene.formatVersion && this.width == scene.width && this.height == scene.height && this.exportWidth == scene.exportWidth && this.exportHeight == scene.exportHeight && Intrinsics.areEqual(this.elements, scene.elements) && this.framesPerHundredSeconds == scene.framesPerHundredSeconds && Intrinsics.areEqual(this.background, scene.background) && this.precompose == scene.precompose && this.type == scene.type && Intrinsics.areEqual(this.bookmarks, scene.bookmarks) && this.reTimingMethod == scene.reTimingMethod && this.reTimingInMark == scene.reTimingInMark && this.reTimingOutMark == scene.reTimingOutMark && this.thumbnailTime == scene.thumbnailTime && this.reTimingAdaptFrameRate == scene.reTimingAdaptFrameRate && this.modifiedTime == scene.modifiedTime && Intrinsics.areEqual(this.mediaInfo, scene.mediaInfo) && Intrinsics.areEqual(this.templateLink, scene.templateLink);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((this.title.hashCode() * 31) + Integer.hashCode(this.formatVersion)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.exportWidth)) * 31) + Integer.hashCode(this.exportHeight)) * 31) + this.elements.hashCode()) * 31) + Integer.hashCode(this.framesPerHundredSeconds)) * 31) + this.background.hashCode()) * 31) + this.precompose.hashCode()) * 31) + this.type.hashCode()) * 31) + this.bookmarks.hashCode()) * 31) + this.reTimingMethod.hashCode()) * 31) + Integer.hashCode(this.reTimingInMark)) * 31) + Integer.hashCode(this.reTimingOutMark)) * 31) + Integer.hashCode(this.thumbnailTime)) * 31) + Boolean.hashCode(this.reTimingAdaptFrameRate)) * 31) + Long.hashCode(this.modifiedTime)) * 31) + this.mediaInfo.hashCode()) * 31;
        String str = this.templateLink;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Scene(title=" + this.title + ", formatVersion=" + this.formatVersion + ", width=" + this.width + ", height=" + this.height + ", exportWidth=" + this.exportWidth + ", exportHeight=" + this.exportHeight + ", elements=" + this.elements + ", framesPerHundredSeconds=" + this.framesPerHundredSeconds + ", background=" + this.background + ", precompose=" + this.precompose + ", type=" + this.type + ", bookmarks=" + this.bookmarks + ", reTimingMethod=" + this.reTimingMethod + ", reTimingInMark=" + this.reTimingInMark + ", reTimingOutMark=" + this.reTimingOutMark + ", thumbnailTime=" + this.thumbnailTime + ", reTimingAdaptFrameRate=" + this.reTimingAdaptFrameRate + ", modifiedTime=" + this.modifiedTime + ", mediaInfo=" + this.mediaInfo + ", templateLink=" + this.templateLink + ")";
    }

    public final SolidColor getBackground() {
        return this.background;
    }

    public final Map<Integer, SceneBookmark> getBookmarks() {
        return this.bookmarks;
    }

    public final List<SceneElement> getElements() {
        return this.elements;
    }

    public final int getExportHeight() {
        return this.exportHeight;
    }

    public final int getExportWidth() {
        return this.exportWidth;
    }

    public final int getFormatVersion() {
        return this.formatVersion;
    }

    public final int getFramesPerHundredSeconds() {
        return this.framesPerHundredSeconds;
    }

    public final int getHeight() {
        return this.height;
    }

    public final Map<Uri, MediaUriInfo> getMediaInfo() {
        return this.mediaInfo;
    }

    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public final PrecomposeType getPrecompose() {
        return this.precompose;
    }

    public final boolean getReTimingAdaptFrameRate() {
        return this.reTimingAdaptFrameRate;
    }

    public final int getReTimingInMark() {
        return this.reTimingInMark;
    }

    public final ReTimingMethod getReTimingMethod() {
        return this.reTimingMethod;
    }

    public final int getReTimingOutMark() {
        return this.reTimingOutMark;
    }

    public final String getTemplateLink() {
        return this.templateLink;
    }

    public final int getThumbnailTime() {
        return this.thumbnailTime;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotalTime() {
        return this.totalTime;
    }

    public final SceneType getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public /* synthetic */ Scene(String str, int i2, int i3, int i5, int i7, int i8, List list, int i9, SolidColor solidColor, PrecomposeType precomposeType, SceneType sceneType, Map map, ReTimingMethod reTimingMethod, int i10, int i11, int i12, boolean z2, long j2, Map map2, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 106 : i2, i3, i5, i7, i8, (i13 & 64) != 0 ? CollectionsKt.emptyList() : list, (i13 & 128) != 0 ? 3000 : i9, (i13 & 256) != 0 ? SolidColor.INSTANCE.getLIGHT_GRAY() : solidColor, (i13 & 512) != 0 ? PrecomposeType.DYNAMIC : precomposeType, (i13 & 1024) != 0 ? SceneType.SCENE : sceneType, (i13 & 2048) != 0 ? MapsKt.emptyMap() : map, (i13 & 4096) != 0 ? ReTimingMethod.FREEZE : reTimingMethod, (i13 & 8192) != 0 ? 0 : i10, (i13 & 16384) != 0 ? 0 : i11, (32768 & i13) != 0 ? -1 : i12, (65536 & i13) != 0 ? false : z2, (131072 & i13) != 0 ? 0L : j2, (262144 & i13) != 0 ? MapsKt.emptyMap() : map2, (i13 & 524288) != 0 ? null : str2);
    }
}
