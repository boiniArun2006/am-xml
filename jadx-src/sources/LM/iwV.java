package LM;

import HI0.AbstractC1370c;
import LM.iwV;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.MimeTypes;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import com.alightcreative.app.motion.scene.MediaUriInfoKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class iwV {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f6028n;
    private final Handler rl;

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ HI0.Q J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6030n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f6031t;

        /* JADX INFO: renamed from: LM.iwV$j$j, reason: collision with other inner class name */
        public static final class C0205j implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(((LM.n) obj).n(), ((LM.n) obj2).n());
            }
        }

        public static final class n implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(((Md) obj).rl(), ((Md) obj2).rl());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(HI0.Q q2, Continuation continuation) {
            super(2, continuation);
            this.J2 = q2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String O(Ref.ObjectRef objectRef) {
            return "ASP hashes: " + objectRef.element;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = iwV.this.new j(this.J2, continuation);
            jVar.f6031t = obj;
            return jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v13, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetFileDescriptor assetFileDescriptorNr;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6030n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GJW.vd vdVar = (GJW.vd) this.f6031t;
            Map mapR = iwV.this.r(this.J2, new LinkedHashSet());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            List<LM.n> listSortedWith = CollectionsKt.sortedWith(mapR.values(), new C0205j());
            HI0.Q q2 = this.J2;
            for (LM.n nVar : listSortedWith) {
                try {
                    assetFileDescriptorNr = q2.nr(nVar.rl().getUri(), "r");
                } catch (FileNotFoundException unused) {
                    assetFileDescriptorNr = null;
                }
                if (assetFileDescriptorNr != null) {
                    try {
                        FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorNr.createInputStream();
                        try {
                            long jMax = Math.max(1L, nVar.rl().getSize());
                            Intrinsics.checkNotNull(fileInputStreamCreateInputStream);
                            String strO = HI0.gnv.o(psW.mUb(fileInputStreamCreateInputStream, 0, 1, null));
                            linkedHashMap.put(nVar.rl().getUri(), strO);
                            MediaUriInfoKt.updateCache(new MediaUriInfo(nVar.rl().getUri(), null, null, null, 0L, 0L, strO, 0, 0, 0, 0L, 0, 4030, null));
                            objectRef.element = objectRef.element + "/" + jMax + "/" + strO;
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(fileInputStreamCreateInputStream, null);
                            CloseableKt.closeFinally(assetFileDescriptorNr, null);
                        } finally {
                        }
                    } finally {
                    }
                }
            }
            Iterator it = CollectionsKt.sortedWith(iwV.this.f6028n, new n()).iterator();
            while (it.hasNext()) {
                Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(((Md) it.next()).n(), null, 1, null), false, false, false, 14, null);
                objectRef.element = objectRef.element + "/P/" + SceneKt.getSha1(sceneUnserializeScene$default);
            }
            XoT.C.Uo(vdVar, new Function0() { // from class: LM.lej
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return iwV.j.O(objectRef);
                }
            });
            byte[] bArrAz = HI0.gnv.az((String) objectRef.element);
            Intrinsics.checkNotNullExpressionValue(bArrAz, "sha1(...)");
            return HI0.gnv.o(bArrAz);
        }
    }

    public iwV(Context context, List projectIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(projectIds, "projectIds");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(projectIds, 10));
        Iterator it = projectIds.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayList.add(new Md(str, HI0.afx.o(context, str)));
        }
        this.f6028n = arrayList;
        this.rl = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence N(Scene it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SceneKt.effectIdsSequence(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scene T(Ref.IntRef intRef, Md it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(it.n(), null, 1, null), false, false, true, 6, null);
        intRef.element = Math.max(intRef.element, sceneUnserializeScene$default.getFormatVersion());
        return sceneUnserializeScene$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViF(long j2, long j3) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String XQ(MediaUriInfo mediaUriInfo) {
        return "NULL PATH: " + mediaUriInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence Z(Scene it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SceneKt.externalMediaSequence(it);
    }

    public static /* synthetic */ Pair aYN(iwV iwv, HI0.Q q2, File file, Function2 function2, Function2 function22, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function2 = new Function2() { // from class: LM.afx
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return iwV.ViF(((Long) obj2).longValue(), ((Long) obj3).longValue());
                }
            };
        }
        if ((i2 & 8) != 0) {
            function22 = new Function2() { // from class: LM.Z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return iwV.nY(((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                }
            };
        }
        return iwv.WPU(q2, file, function2, function22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri e(Map map, Map map2, Map map3, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        n nVar = (n) map.get(uri);
        String strN = nVar != null ? nVar.n() : null;
        if (strN == null) {
            return uri;
        }
        Uri uri2 = Uri.parse("amproj:" + strN);
        MediaUriInfo mediaUriInfoFromCache = MediaUriInfo.INSTANCE.fromCache(uri);
        if (mediaUriInfoFromCache != null) {
            Intrinsics.checkNotNull(uri2);
            map2.put(uri2, mediaUriInfoFromCache.copy((4094 & 1) != 0 ? mediaUriInfoFromCache.uri : uri2, (4094 & 2) != 0 ? mediaUriInfoFromCache.filename : null, (4094 & 4) != 0 ? mediaUriInfoFromCache.title : null, (4094 & 8) != 0 ? mediaUriInfoFromCache.mime : null, (4094 & 16) != 0 ? mediaUriInfoFromCache.size : 0L, (4094 & 32) != 0 ? mediaUriInfoFromCache.infoUpdated : 0L, (4094 & 64) != 0 ? mediaUriInfoFromCache.sig : (String) map3.get(mediaUriInfoFromCache.getUri()), (4094 & 128) != 0 ? mediaUriInfoFromCache.width : 0, (4094 & 256) != 0 ? mediaUriInfoFromCache.height : 0, (4094 & 512) != 0 ? mediaUriInfoFromCache.orientation : 0, (4094 & 1024) != 0 ? mediaUriInfoFromCache.duration : 0L, (4094 & 2048) != 0 ? mediaUriInfoFromCache.fphs : 0));
        }
        Intrinsics.checkNotNull(uri2);
        return uri2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fD(Function2 function2, Ref.IntRef intRef, int i2) {
        function2.invoke(Integer.valueOf(intRef.element), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Function2 function2, Ref.IntRef intRef, int i2) {
        function2.invoke(Integer.valueOf(intRef.element), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit iF(final Ref.IntRef intRef, Ref.IntRef intRef2, long j2, long j3, iwV iwv, File file, long j4, Ref.LongRef longRef, final Function2 function2, final int i2, final Function2 function22, final long j5, long j6) {
        intRef.element = intRef2.element + ((int) Math.max(1L, Math.min(j2, j6) / j3));
        iwv.rl.post(new Runnable() { // from class: LM.s4
            @Override // java.lang.Runnable
            public final void run() {
                iwV.fD(function2, intRef, i2);
            }
        });
        final long jMax = Math.max((((long) 75) * j4) / ((long) 100), file.length());
        if (jMax > longRef.element + 524288) {
            longRef.element = jMax;
            iwv.rl.post(new Runnable() { // from class: LM.g9s
                @Override // java.lang.Runnable
                public final void run() {
                    iwV.E2(function22, jMax, j5);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nHg(Function2 function2, Ref.IntRef intRef, int i2) {
        function2.invoke(Integer.valueOf(intRef.element), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nY(int i2, int i3) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scene o(Md it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(it.n(), null, 1, null), false, false, false, 14, null);
        Iterator<T> it2 = sceneUnserializeScene$default.getMediaInfo().values().iterator();
        while (it2.hasNext()) {
            MediaUriInfoKt.updateCache((MediaUriInfo) it2.next());
        }
        return sceneUnserializeScene$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a9, code lost:
    
        r26.add(r6);
        r3 = kotlin.TuplesKt.to(r3.getUri(), new LM.n(r3, r6));
        r4.put(r3.getFirst(), r3.getSecond());
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map r(HI0.Q q2, Set set) {
        MediaUriInfo mediaUriInfo;
        Set<Uri> set2 = SequencesKt.toSet(SequencesKt.flatMap(SequencesKt.map(CollectionsKt.asSequence(this.f6028n), new Function1() { // from class: LM.Ew
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return iwV.o((Md) obj);
            }
        }), new Function1() { // from class: LM.nKK
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return iwV.Z((Scene) obj);
            }
        }));
        ArrayList<MediaUriInfo> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
        for (Uri uri : set2) {
            MediaUriInfo mediaUriInfoFromCache = MediaUriInfo.INSTANCE.fromCache(uri);
            if (mediaUriInfoFromCache == null) {
                tu.SPz sPzTe = tu.r.te(q2, uri, false, 4, null);
                if (sPzTe instanceof tu.C) {
                    mediaUriInfo = new MediaUriInfo(uri, null, null, null, 0L, 0L, null, 0, 0, 0, 0L, 0, 4094, null);
                } else {
                    if (!(sPzTe instanceof tu.aC)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tu.aC aCVar = (tu.aC) sPzTe;
                    String strO = aCVar.O();
                    tu.u uVarGh = aCVar.gh();
                    int iO = uVarGh != null ? uVarGh.O() * 100 : -1;
                    mediaUriInfo = new MediaUriInfo(uri, strO, aCVar.mUb(), aCVar.KN(), aCVar.nr(), 0L, null, aCVar.qie(), aCVar.J2(), aCVar.xMQ(), aCVar.t(), iO, 96, null);
                    MediaUriInfoKt.updateCache(mediaUriInfo);
                }
                mediaUriInfoFromCache = mediaUriInfo;
            }
            arrayList.add(mediaUriInfoFromCache);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (final MediaUriInfo mediaUriInfo2 : arrayList) {
            String filename = mediaUriInfo2.getFilename();
            if (filename == null && (filename = mediaUriInfo2.getTitle()) == null && (filename = mediaUriInfo2.getUri().getLastPathSegment()) == null) {
                filename = mediaUriInfo2.getUri().getSchemeSpecificPart();
            }
            if (filename == null) {
                XoT.C.Uo(this, new Function0() { // from class: LM.DAz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iwV.XQ(mediaUriInfo2);
                    }
                });
            }
            File file = new File(filename);
            String extension = FilesKt.getExtension(file);
            if (StringsKt.isBlank(extension)) {
                String mime = mediaUriInfo2.getMime();
                if (mime != null) {
                    switch (mime.hashCode()) {
                        case -1487394660:
                            extension = mime.equals("image/jpeg") ? ".jpg" : "";
                            break;
                        case -1487018032:
                            if (mime.equals(MimeTypes.IMAGE_WEBP)) {
                                extension = ".webp";
                                break;
                            }
                            break;
                        case -879272239:
                            if (mime.equals(MimeTypes.IMAGE_BMP)) {
                                extension = ".bmp";
                                break;
                            }
                            break;
                        case -879267568:
                            if (mime.equals("image/gif")) {
                                extension = ".gif";
                                break;
                            }
                            break;
                        case -879258763:
                            if (mime.equals(MimeTypes.IMAGE_PNG)) {
                                extension = ".png";
                                break;
                            }
                            break;
                        case 187090231:
                            if (mime.equals("audio/mp3")) {
                                extension = ".mp3";
                                break;
                            }
                            break;
                        case 1331848029:
                            if (mime.equals("video/mp4")) {
                                extension = ".mp4";
                                break;
                            }
                            break;
                        case 1504831518:
                            if (!mime.equals("audio/mpeg")) {
                            }
                            break;
                    }
                }
            }
            for (String str : psW.KN(FilesKt.getNameWithoutExtension(file), extension)) {
                if (!set.contains(str)) {
                    break;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String te(n nVar) {
        return "Packaging: " + nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.lang.Throwable, java.nio.charset.Charset] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final Pair WPU(HI0.Q q2, File file, Function2 function2, final Function2 progressCallback) {
        String str;
        FileOutputStream fileOutputStream;
        Throwable th;
        ZipOutputStream zipOutputStream;
        Throwable th2;
        ?? r02;
        Ref.IntRef intRef;
        Set set;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;
        FileOutputStream fileOutputStream4;
        Ref.IntRef intRef2;
        AssetFileDescriptor assetFileDescriptorNr;
        AssetFileDescriptor assetFileDescriptor;
        Throwable th3;
        FileInputStream fileInputStream;
        final long jMax;
        final Ref.IntRef intRef3;
        LinkedHashMap linkedHashMap;
        Ref.IntRef intRef4;
        Map map;
        Set set2;
        ZipOutputStream zipOutputStream2;
        final long j2;
        final Ref.IntRef intRef5;
        String str2;
        final long j3;
        LinkedHashMap linkedHashMap2;
        Object obj;
        Map map2;
        long size;
        int iHashCode;
        AssetFileDescriptor assetFileDescriptorNr2;
        HI0.Q contentResolver = q2;
        final File targetFile = file;
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(targetFile, "targetFile");
        final Function2 sizeCallback = function2;
        Intrinsics.checkNotNullParameter(sizeCallback, "sizeCallback");
        Intrinsics.checkNotNullParameter(progressCallback, "progressCallback");
        if (targetFile.exists()) {
            throw new IllegalStateException("Check failed.");
        }
        File parentFile = targetFile.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        final Ref.IntRef intRef6 = new Ref.IntRef();
        Set set3 = SequencesKt.toSet(SequencesKt.flatMap(SequencesKt.map(CollectionsKt.asSequence(this.f6028n), new Function1() { // from class: LM.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return iwV.T(intRef6, (Md) obj2);
            }
        }), new Function1() { // from class: LM.qf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return iwV.N((Scene) obj2);
            }
        }));
        Map mapR = r(contentResolver, linkedHashSet);
        Iterator it = mapR.values().iterator();
        final int iMax = 0;
        while (it.hasNext()) {
            iMax += (int) Math.max(1L, ((n) it.next()).rl().getSize() / 2048);
        }
        final Ref.IntRef intRef7 = new Ref.IntRef();
        this.rl.post(new Runnable() { // from class: LM.Ln
            @Override // java.lang.Runnable
            public final void run() {
                iwV.nHg(progressCallback, intRef7, iMax);
            }
        });
        final Ref.LongRef longRef = new Ref.LongRef();
        Iterator it2 = mapR.values().iterator();
        long size2 = 0;
        while (it2.hasNext()) {
            size2 += ((n) it2.next()).rl().getSize();
        }
        Iterator it3 = mapR.values().iterator();
        final long j4 = 0;
        while (true) {
            str = "r";
            if (!it3.hasNext()) {
                break;
            }
            n nVar = (n) it3.next();
            String mime = nVar.rl().getMime();
            if (mime == null || ((iHashCode = mime.hashCode()) == -1487394660 ? !mime.equals("image/jpeg") : !(iHashCode == -1487018032 ? mime.equals(MimeTypes.IMAGE_WEBP) : iHashCode == -879258763 && mime.equals(MimeTypes.IMAGE_PNG)))) {
                map2 = mapR;
                size = nVar.rl().getSize();
            } else {
                try {
                    assetFileDescriptorNr2 = contentResolver.nr(nVar.rl().getUri(), "r");
                } catch (FileNotFoundException unused) {
                    assetFileDescriptorNr2 = null;
                }
                if (assetFileDescriptorNr2 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(assetFileDescriptorNr2.getFileDescriptor());
                        Intrinsics.checkNotNullExpressionValue(bitmapDecodeFileDescriptor, "decodeFileDescriptor(...)");
                        map2 = mapR;
                        AbstractC1370c.nr(bitmapDecodeFileDescriptor, 1080, 1080).compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
                        size = byteArrayOutputStream.size();
                        CloseableKt.closeFinally(assetFileDescriptorNr2, null);
                    } finally {
                    }
                } else {
                    map2 = mapR;
                    size = 0;
                }
            }
            j4 += size;
            mapR = map2;
        }
        Map map3 = mapR;
        Object obj2 = null;
        FileOutputStream fileOutputStream5 = new FileOutputStream(targetFile);
        try {
            ZipOutputStream zipOutputStream3 = new ZipOutputStream(fileOutputStream5);
            try {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (final n nVar2 : map3.values()) {
                    try {
                        fileOutputStream4 = fileOutputStream5;
                        try {
                            intRef2 = intRef6;
                            this.rl.post(new Runnable() { // from class: LM.UGc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    iwV.g(progressCallback, intRef7, iMax);
                                }
                            });
                            XoT.C.Uo(this, new Function0() { // from class: LM.Q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return iwV.te(nVar2);
                                }
                            });
                        } catch (Throwable th4) {
                            th = th4;
                            zipOutputStream = zipOutputStream3;
                            fileOutputStream3 = fileOutputStream4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        fileOutputStream3 = fileOutputStream5;
                        zipOutputStream = zipOutputStream3;
                    }
                    try {
                        assetFileDescriptorNr = contentResolver.nr(nVar2.rl().getUri(), str);
                    } catch (FileNotFoundException unused2) {
                        assetFileDescriptorNr = null;
                    } catch (Throwable th6) {
                        th2 = th6;
                        zipOutputStream = zipOutputStream3;
                        fileOutputStream = fileOutputStream4;
                        try {
                            throw th2;
                        } catch (Throwable th7) {
                            try {
                                CloseableKt.closeFinally(zipOutputStream, th2);
                                throw th7;
                            } catch (Throwable th8) {
                                th = th8;
                                th = th;
                                try {
                                    throw th;
                                } catch (Throwable th9) {
                                    CloseableKt.closeFinally(fileOutputStream, th);
                                    throw th9;
                                }
                            }
                        }
                    }
                    Ref.IntRef intRef8 = new Ref.IntRef();
                    intRef8.element = intRef7.element;
                    if (assetFileDescriptorNr != null) {
                        try {
                            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptorNr;
                            try {
                                zipOutputStream3.putNextEntry(new ZipEntry(nVar2.n()));
                                FileInputStream fileInputStreamCreateInputStream = assetFileDescriptor2.createInputStream();
                                try {
                                    Set set4 = set3;
                                    jMax = Math.max(1L, nVar2.rl().getSize());
                                    Intrinsics.checkNotNull(fileInputStreamCreateInputStream);
                                    intRef3 = intRef7;
                                    linkedHashMap = linkedHashMap3;
                                    intRef4 = intRef2;
                                    fileOutputStream3 = fileOutputStream4;
                                    map = map3;
                                    set2 = set4;
                                    zipOutputStream2 = zipOutputStream3;
                                    j2 = size2;
                                    intRef5 = intRef8;
                                    str2 = str;
                                    j3 = 2048;
                                    try {
                                        fileInputStream = fileInputStreamCreateInputStream;
                                        zipOutputStream = zipOutputStream2;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        fileInputStream = fileInputStreamCreateInputStream;
                                        zipOutputStream = zipOutputStream2;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    zipOutputStream = zipOutputStream3;
                                    fileOutputStream3 = fileOutputStream4;
                                    assetFileDescriptor = assetFileDescriptor2;
                                    fileInputStream = fileInputStreamCreateInputStream;
                                }
                                try {
                                    String strO = HI0.gnv.o(psW.o(fileInputStreamCreateInputStream, zipOutputStream2, 0, new Function1() { // from class: LM.r
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            return iwV.iF(intRef5, intRef3, jMax, j3, this, targetFile, j2, longRef, progressCallback, iMax, sizeCallback, j4, ((Long) obj3).longValue());
                                        }
                                    }, 2, null));
                                    linkedHashMap2 = linkedHashMap;
                                    linkedHashMap2.put(nVar2.rl().getUri(), strO);
                                    MediaUriInfoKt.updateCache(new MediaUriInfo(nVar2.rl().getUri(), null, null, null, 0L, 0L, strO, 0, 0, 0, 0L, 0, 4030, null));
                                    Unit unit = Unit.INSTANCE;
                                    obj = null;
                                    try {
                                        CloseableKt.closeFinally(fileInputStream, null);
                                        try {
                                            CloseableKt.closeFinally(assetFileDescriptor2, null);
                                        } catch (Throwable th12) {
                                            th = th12;
                                            th2 = th;
                                            fileOutputStream = fileOutputStream3;
                                            throw th2;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        assetFileDescriptor = assetFileDescriptor2;
                                        th3 = th;
                                        try {
                                            throw th3;
                                        } catch (Throwable th14) {
                                            CloseableKt.closeFinally(assetFileDescriptor, th3);
                                            throw th14;
                                        }
                                    }
                                } catch (Throwable th15) {
                                    th = th15;
                                    assetFileDescriptor = assetFileDescriptor2;
                                    Throwable th16 = th;
                                    try {
                                        throw th16;
                                    } catch (Throwable th17) {
                                        try {
                                            CloseableKt.closeFinally(fileInputStream, th16);
                                            throw th17;
                                        } catch (Throwable th18) {
                                            th = th18;
                                            th3 = th;
                                            throw th3;
                                        }
                                    }
                                }
                            } catch (Throwable th19) {
                                th = th19;
                                zipOutputStream = zipOutputStream3;
                                fileOutputStream3 = fileOutputStream4;
                                assetFileDescriptor = assetFileDescriptor2;
                            }
                        } catch (Throwable th20) {
                            th = th20;
                            assetFileDescriptor = assetFileDescriptorNr;
                            zipOutputStream = zipOutputStream3;
                            fileOutputStream3 = fileOutputStream4;
                        }
                    } else {
                        intRef5 = intRef8;
                        set2 = set3;
                        intRef3 = intRef7;
                        zipOutputStream = zipOutputStream3;
                        linkedHashMap2 = linkedHashMap3;
                        j2 = size2;
                        intRef4 = intRef2;
                        fileOutputStream3 = fileOutputStream4;
                        map = map3;
                        obj = null;
                        str2 = str;
                    }
                    intRef3.element = intRef5.element;
                    targetFile = file;
                    obj2 = obj;
                    intRef7 = intRef3;
                    str = str2;
                    intRef6 = intRef4;
                    map3 = map;
                    fileOutputStream5 = fileOutputStream3;
                    contentResolver = q2;
                    size2 = j2;
                    linkedHashMap3 = linkedHashMap2;
                    sizeCallback = function2;
                    zipOutputStream3 = zipOutputStream;
                    set3 = set2;
                }
                r02 = obj2;
                intRef = intRef6;
                set = set3;
                fileOutputStream2 = fileOutputStream5;
                zipOutputStream = zipOutputStream3;
                final LinkedHashMap linkedHashMap4 = linkedHashMap3;
                Map map4 = map3;
                try {
                    for (Md md : this.f6028n) {
                        Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(md.n(), r02, 1, r02), false, false, false, 14, null);
                        final LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                        final Map map5 = map4;
                        String strSerializeScene$default = SceneSerializerKt.serializeScene$default(SceneKt.remapMediaUris(sceneUnserializeScene$default, new Function1() { // from class: LM.SPz
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return iwV.e(map5, linkedHashMap5, linkedHashMap4, (Uri) obj3);
                            }
                        }), true, linkedHashMap5, false, false, null, 56, null);
                        zipOutputStream.putNextEntry(new ZipEntry(md.n().getName()));
                        byte[] bytes = strSerializeScene$default.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        zipOutputStream.write(bytes);
                        map4 = map5;
                    }
                    Map map6 = map4;
                    zipOutputStream.putNextEntry(new ZipEntry("manifest.txt"));
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : linkedHashMap4.entrySet()) {
                        Uri uri = (Uri) entry.getKey();
                        String str3 = (String) entry.getValue();
                        n nVar3 = (n) map6.get(uri);
                        ?? N2 = nVar3 != null ? nVar3.n() : r02;
                        ?? r6 = N2 == 0 ? r02 : str3 + ":" + N2;
                        if (r6 != 0) {
                            arrayList.add(r6);
                        }
                    }
                    byte[] bytes2 = CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null).getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                    zipOutputStream.write(bytes2);
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th21) {
                    th = th21;
                    fileOutputStream = fileOutputStream2;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th22) {
                th = th22;
                fileOutputStream = fileOutputStream5;
                zipOutputStream = zipOutputStream3;
            }
        } catch (Throwable th23) {
            th = th23;
            fileOutputStream = fileOutputStream5;
        }
        try {
            CloseableKt.closeFinally(zipOutputStream, r02);
            CloseableKt.closeFinally(fileOutputStream2, r02);
            this.rl.post(new Runnable() { // from class: LM.ci
                @Override // java.lang.Runnable
                public final void run() {
                    iwV.X(progressCallback, iMax);
                }
            });
            return new Pair(set, Integer.valueOf(intRef.element));
        } catch (Throwable th24) {
            th = th24;
            fileOutputStream = fileOutputStream2;
            th = th;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E2(Function2 function2, long j2, long j3) {
        function2.invoke(Long.valueOf(j2), Long.valueOf(j3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(Function2 function2, int i2) {
        function2.invoke(Integer.valueOf(i2), Integer.valueOf(i2));
    }

    public final Object S(HI0.Q q2, Continuation continuation) {
        return GJW.Dsr.Uo(GJW.OU.rl(), new j(q2, null), continuation);
    }
}
