package com.alightcreative.app.motion.scene;

import Hr.CQ.USEaHtCMH;
import android.net.Uri;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\f\u001a\u0004\u0018\u00010\u0000*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r\" \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00000\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/alightcreative/app/motion/scene/MediaUriInfo;", InneractiveMediationNameConsts.OTHER, "merge", "(Lcom/alightcreative/app/motion/scene/MediaUriInfo;Lcom/alightcreative/app/motion/scene/MediaUriInfo;)Lcom/alightcreative/app/motion/scene/MediaUriInfo;", "", "updateCache", "(Lcom/alightcreative/app/motion/scene/MediaUriInfo;)V", "LHI0/Q;", "Landroid/net/Uri;", "uri", "Lcom/alightcreative/app/motion/scene/Scene;", "scene", "mediaUriInfoOf", "(LHI0/Q;Landroid/net/Uri;Lcom/alightcreative/app/motion/scene/Scene;)Lcom/alightcreative/app/motion/scene/MediaUriInfo;", "", "mediaUriInfoCache", "Ljava/util/Map;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaUriInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaUriInfo.kt\ncom/alightcreative/app/motion/scene/MediaUriInfoKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class MediaUriInfoKt {
    private static final Map<Uri, MediaUriInfo> mediaUriInfoCache = new LinkedHashMap();

    public static final MediaUriInfo mediaUriInfoOf(HI0.Q q2, Uri uri, Scene scene) {
        Map<Uri, MediaUriInfo> mediaInfo;
        Intrinsics.checkNotNullParameter(q2, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        MediaUriInfo mediaUriInfoFromCache = MediaUriInfo.INSTANCE.fromCache(uri);
        if (mediaUriInfoFromCache != null) {
            return mediaUriInfoFromCache;
        }
        MediaUriInfo mediaUriInfo = (scene == null || (mediaInfo = scene.getMediaInfo()) == null) ? null : mediaInfo.get(uri);
        if (mediaUriInfo != null) {
            return mediaUriInfo;
        }
        tu.SPz sPzTe = tu.r.te(q2, uri, false, 4, null);
        if (sPzTe instanceof tu.C) {
            return null;
        }
        if (!(sPzTe instanceof tu.aC)) {
            throw new NoWhenBranchMatchedException();
        }
        tu.aC aCVar = (tu.aC) sPzTe;
        MediaUriInfo mediaUriInfo2 = new MediaUriInfo(uri, null, null, aCVar.KN(), 0L, 0L, null, aCVar.qie(), aCVar.J2(), aCVar.xMQ(), aCVar.t(), 0, 2166, null);
        updateCache(mediaUriInfo2);
        return mediaUriInfo2;
    }

    public static /* synthetic */ MediaUriInfo mediaUriInfoOf$default(HI0.Q q2, Uri uri, Scene scene, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            scene = null;
        }
        return mediaUriInfoOf(q2, uri, scene);
    }

    public static final MediaUriInfo merge(MediaUriInfo mediaUriInfo, MediaUriInfo other) {
        Intrinsics.checkNotNullParameter(mediaUriInfo, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (mediaUriInfo.getInfoUpdated() < other.getInfoUpdated()) {
            return mediaUriInfo;
        }
        Uri uri = mediaUriInfo.getUri();
        String filename = other.getFilename();
        if (filename == null) {
            filename = mediaUriInfo.getFilename();
        }
        String str = filename;
        String title = other.getTitle();
        if (title == null) {
            title = mediaUriInfo.getTitle();
        }
        String str2 = title;
        String mime = other.getMime();
        if (mime == null) {
            mime = mediaUriInfo.getMime();
        }
        String str3 = mime;
        String sig = other.getSig();
        if (sig == null) {
            sig = mediaUriInfo.getSig();
        }
        String str4 = sig;
        return new MediaUriInfo(uri, str, str2, str3, other.getSize() < 0 ? mediaUriInfo.getSize() : other.getSize(), 0L, str4, other.getWidth() < 0 ? mediaUriInfo.getWidth() : other.getWidth(), other.getHeight() < 0 ? mediaUriInfo.getHeight() : other.getHeight(), other.getOrientation() < 0 ? mediaUriInfo.getOrientation() : other.getOrientation(), other.getDuration() < 0 ? mediaUriInfo.getDuration() : other.getDuration(), other.getFphs() < 0 ? mediaUriInfo.getFphs() : other.getFphs(), 32, null);
    }

    public static final void updateCache(MediaUriInfo mediaUriInfo) {
        MediaUriInfo mediaUriInfoMerge;
        Intrinsics.checkNotNullParameter(mediaUriInfo, USEaHtCMH.TZPICxmI);
        Map<Uri, MediaUriInfo> map = mediaUriInfoCache;
        synchronized (map) {
            try {
                Uri uri = mediaUriInfo.getUri();
                MediaUriInfo mediaUriInfo2 = map.get(mediaUriInfo.getUri());
                if (mediaUriInfo2 != null && (mediaUriInfoMerge = merge(mediaUriInfo2, mediaUriInfo)) != null) {
                    mediaUriInfo = mediaUriInfoMerge;
                }
                map.put(uri, mediaUriInfo);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
