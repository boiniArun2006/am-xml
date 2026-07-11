package LM;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.alightcreative.app.motion.project.VideoResolutionTooHighException;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import com.alightcreative.app.motion.scene.MediaUriInfoKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class qYU {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List f6053n = CollectionsKt.listOf((Object[]) new String[]{com.safedk.android.utils.n.f63223d, "mov", "mpg", "mpeg", "3gp", "3gpp"});
    private static final List rl = CollectionsKt.listOf((Object[]) new String[]{"jpg", "jpeg", "png", "gif", "webp", "heic"});

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List f6054t = CollectionsKt.listOf((Object[]) new String[]{"m4a", "aac", "wav", "mp3"});

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SceneType.values().length];
            try {
                iArr[SceneType.SCENE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SceneType.ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SceneType.PRESET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(Ref.IntRef intRef) {
        intRef.element++;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.contains$default((CharSequence) it, ':', false, 2, (Object) null);
    }

    private static final Scene GR(final Context context, String str, final Map map, final Function0 function0, final Function0 function02) {
        final Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(str, true, false, false, 12, null);
        return SceneKt.remapMediaUris(sceneUnserializeScene$default, new Function1() { // from class: LM.YzO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qYU.Y(context, sceneUnserializeScene$default, map, function0, function02, (Uri) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String J(String str, String str2) {
        return "ImportPackagedProject: sigFilenameMap[" + str + "]=" + str2;
    }

    static /* synthetic */ Scene Nxk(Context context, String str, Map map, Function0 function0, Function0 function02, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function0 = new Function0() { // from class: LM.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qYU.piY();
                }
            };
        }
        if ((i2 & 8) != 0) {
            function02 = new Function0() { // from class: LM.iF
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qYU.ijL();
                }
            };
        }
        return GR(context, str, map, function0, function02);
    }

    public static final void X(Context context, File file, String projectId, boolean z2) throws MalformedSceneException {
        final ZipEntry nextEntry;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        File fileGh = HI0.afx.gh(context);
        HI0.afx.ty(context).mkdir();
        final Map mapFD = fD(file);
        XoT.C.Uo(context, new Function0() { // from class: LM.FKk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qYU.T(mapFD);
            }
        });
        for (Map.Entry entry : mapFD.entrySet()) {
            final String str = (String) entry.getKey();
            final LM.j jVar = (LM.j) entry.getValue();
            XoT.C.Uo(context, new Function0() { // from class: LM.Fl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qYU.N(str, jVar);
                }
            });
        }
        I(context, file, mapFD);
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            do {
                nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    final LM.j jVar2 = (LM.j) mapFD.get(nextEntry.getName());
                    XoT.C.Uo(context, new Function0() { // from class: LM.R6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return qYU.nHg(nextEntry, jVar2);
                        }
                    });
                    if (jVar2 != null) {
                        String name = nextEntry.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        String strSubstringAfterLast$default = StringsKt.substringAfterLast$default(name, '.', (String) null, 2, (Object) null);
                        Locale ENGLISH = Locale.ENGLISH;
                        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                        String lowerCase = strSubstringAfterLast$default.toLowerCase(ENGLISH);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        String str2 = jVar2.t() + "." + lowerCase;
                        File fileResolve = FilesKt.resolve(fileGh, str2);
                        if (!fileResolve.exists() || fileResolve.length() < nextEntry.getSize()) {
                            FileOutputStream fileOutputStream = new FileOutputStream(fileResolve);
                            try {
                                ByteStreamsKt.copyTo$default(zipInputStream, fileOutputStream, 0, 2, null);
                                CloseableKt.closeFinally(fileOutputStream, null);
                            } finally {
                            }
                        }
                        linkedHashMap.put(jVar2.rl(), str2);
                    } else {
                        String name2 = nextEntry.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                        if (StringsKt.endsWith$default(name2, ".xml", false, 2, (Object) null)) {
                            XoT.C.Uo(context, new Function0() { // from class: LM.RzR
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return qYU.s7N(nextEntry);
                                }
                            });
                            arrayList.add(TextStreamsKt.readText(new InputStreamReader(zipInputStream, Charsets.UTF_8)));
                        } else if (!Intrinsics.areEqual(nextEntry.getName(), "manifest.txt")) {
                            XoT.C.Uo(context, new Function0() { // from class: LM.pq
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return qYU.wTp(nextEntry);
                                }
                            });
                        }
                    }
                }
            } while (nextEntry != null);
            XoT.C.Uo(context, new Function0() { // from class: LM.kO4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qYU.v(linkedHashMap);
                }
            });
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                final String str3 = (String) entry2.getKey();
                final String str4 = (String) entry2.getValue();
                XoT.C.Uo(context, new Function0() { // from class: LM.hQ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qYU.rV9(str3, str4);
                    }
                });
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                FilesKt.writeText$default(HI0.afx.o(context, projectId), SceneSerializerKt.serializeScene$default((Scene) w9.Wre.n(Nxk(context, (String) it.next(), linkedHashMap2, null, null, 12, null), z2, new Function1() { // from class: LM.P
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qYU.bzg((Scene) obj);
                    }
                }), false, null, false, false, null, 62, null), null, 2, null);
                linkedHashMap = linkedHashMap2;
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(zipInputStream, null);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02f2 A[LOOP:1: B:8:0x008e->B:103:0x02f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01cc A[EDGE_INSN: B:127:0x01cc->B:58:0x01cc BREAK  A[LOOP:1: B:8:0x008e->B:103:0x02f2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014d A[Catch: all -> 0x00e4, TRY_LEAVE, TryCatch #5 {all -> 0x00e4, blocks: (B:11:0x0096, B:15:0x00ae, B:17:0x00d7, B:28:0x0119, B:30:0x013b, B:38:0x015f, B:61:0x01e2, B:34:0x014d, B:37:0x015c, B:45:0x0174, B:46:0x0177, B:21:0x00e9, B:23:0x00f1, B:24:0x00fc, B:26:0x0104, B:27:0x010f, B:47:0x0178, B:49:0x018e, B:50:0x01a5, B:52:0x01b1, B:36:0x0159, B:43:0x0172), top: B:118:0x0096, inners: #0, #2 }] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final aC Xw(Context context, File file, Function1 onImportFailed, String templateLink) throws MalformedSceneException {
        ZipInputStream zipInputStream;
        Throwable th;
        final LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        int i2;
        int i3;
        int i5;
        int i7;
        int i8;
        File file2;
        Map map;
        Charset charset;
        int i9;
        int i10;
        File fileResolve;
        int i11;
        int i12;
        int i13;
        ZipInputStream zipInputStream2;
        Iterator it;
        int i14;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        LinkedHashMap linkedHashMap2;
        Charset charset2;
        Scene sceneGR;
        UUID uuidRandomUUID;
        File fileZ;
        int i15;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(onImportFailed, "onImportFailed");
        Intrinsics.checkNotNullParameter(templateLink, "templateLink");
        File fileGh = HI0.afx.gh(context2);
        final Map mapFD = fD(file);
        XoT.C.Uo(context2, new Function0() { // from class: LM.yg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qYU.jB(mapFD);
            }
        });
        for (Map.Entry entry : mapFD.entrySet()) {
            final String str = (String) entry.getKey();
            final LM.j jVar = (LM.j) entry.getValue();
            XoT.C.Uo(context2, new Function0() { // from class: LM.mz
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qYU.U(str, jVar);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        final Ref.IntRef intRef3 = new Ref.IntRef();
        final Ref.IntRef intRef4 = new Ref.IntRef();
        I(context2, file, mapFD);
        ZipInputStream zipInputStream3 = new ZipInputStream(new FileInputStream(file));
        try {
            linkedHashMap = new LinkedHashMap();
            arrayList = new ArrayList();
            i2 = 0;
            i3 = 0;
            i5 = 0;
            i7 = 0;
            i8 = 1;
        } catch (Throwable th2) {
            th = th2;
            zipInputStream = zipInputStream3;
        }
        while (true) {
            final ZipEntry nextEntry = zipInputStream3.getNextEntry();
            int i16 = i2;
            try {
                if (nextEntry != null) {
                    try {
                        final LM.j jVar2 = (LM.j) mapFD.get(nextEntry.getName());
                        XoT.C.Uo(context2, new Function0() { // from class: LM.OU
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return qYU.P5(nextEntry, jVar2);
                            }
                        });
                        if (jVar2 != null) {
                            map = mapFD;
                            String name = nextEntry.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            String strSubstringAfterLast$default = StringsKt.substringAfterLast$default(name, '.', (String) null, 2, (Object) null);
                            Locale ENGLISH = Locale.ENGLISH;
                            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                            String lowerCase = strSubstringAfterLast$default.toLowerCase(ENGLISH);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (f6053n.contains(lowerCase)) {
                                XoT.C.Uo(context2, new Function0() { // from class: LM.p
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return qYU.M7(nextEntry);
                                    }
                                });
                                i3++;
                            } else if (f6054t.contains(lowerCase)) {
                                XoT.C.Uo(context2, new Function0() { // from class: LM.LEl
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return qYU.p5(nextEntry);
                                    }
                                });
                                i5++;
                            } else if (rl.contains(lowerCase)) {
                                XoT.C.Uo(context2, new Function0() { // from class: LM.gnv
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return qYU.eF(nextEntry);
                                    }
                                });
                                i7++;
                            } else {
                                XoT.C.Uo(context2, new Function0() { // from class: LM.fg
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return qYU.E(nextEntry);
                                    }
                                });
                                i10 = i16 + 1;
                                String str2 = jVar2.t() + "." + lowerCase;
                                fileResolve = FilesKt.resolve(fileGh, str2);
                                if (fileResolve.exists() || fileResolve.length() < nextEntry.getSize()) {
                                    FileOutputStream fileOutputStream = new FileOutputStream(fileResolve);
                                    file2 = fileGh;
                                    i11 = i10;
                                    try {
                                        ByteStreamsKt.copyTo$default(zipInputStream3, fileOutputStream, 0, 2, null);
                                        CloseableKt.closeFinally(fileOutputStream, null);
                                    } finally {
                                    }
                                } else {
                                    file2 = fileGh;
                                    i11 = i10;
                                }
                                linkedHashMap.put(jVar2.rl(), str2);
                                i9 = i11;
                                i12 = i7;
                                charset = null;
                                i13 = i3;
                                if (nextEntry != null) {
                                    break;
                                }
                                i7 = i12;
                                i3 = i13;
                                context2 = context;
                                mapFD = map;
                                fileGh = file2;
                                arrayList2 = arrayList2;
                                i2 = i9;
                                th = th;
                            }
                            i10 = i16;
                            String str22 = jVar2.t() + "." + lowerCase;
                            fileResolve = FilesKt.resolve(fileGh, str22);
                            if (fileResolve.exists()) {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(fileResolve);
                                file2 = fileGh;
                                i11 = i10;
                                ByteStreamsKt.copyTo$default(zipInputStream3, fileOutputStream2, 0, 2, null);
                                CloseableKt.closeFinally(fileOutputStream2, null);
                                linkedHashMap.put(jVar2.rl(), str22);
                                i9 = i11;
                                i12 = i7;
                                charset = null;
                                i13 = i3;
                                if (nextEntry != null) {
                                }
                                th = th;
                            }
                        } else {
                            file2 = fileGh;
                            map = mapFD;
                            String name2 = nextEntry.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            charset = null;
                            if (StringsKt.endsWith$default(name2, ".xml", false, 2, (Object) null)) {
                                XoT.C.Uo(context2, new Function0() { // from class: LM.KH
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return qYU.M(nextEntry);
                                    }
                                });
                                arrayList.add(TextStreamsKt.readText(new InputStreamReader(zipInputStream3, Charsets.UTF_8)));
                            } else {
                                if (!Intrinsics.areEqual(nextEntry.getName(), "manifest.txt")) {
                                    XoT.C.Uo(context2, new Function0() { // from class: LM.Mf
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return qYU.FX(nextEntry);
                                        }
                                    });
                                    i9 = i16 + 1;
                                }
                                i12 = i7;
                                i13 = i3;
                                if (nextEntry != null) {
                                }
                                th = th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        zipInputStream = zipInputStream3;
                    }
                    throw th;
                }
                file2 = fileGh;
                map = mapFD;
                charset = null;
                throw th;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(zipInputStream, th);
                throw th4;
            }
            i9 = i16;
            i12 = i7;
            i13 = i3;
            if (nextEntry != null) {
            }
            th = th;
        }
        XoT.C.Uo(context2, new Function0() { // from class: LM.o7q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qYU.B(linkedHashMap);
            }
        });
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            final String str3 = (String) entry2.getKey();
            final String str4 = (String) entry2.getValue();
            XoT.C.Uo(context2, new Function0() { // from class: LM.pO
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qYU.J(str3, str4);
                }
            });
        }
        Iterator it2 = arrayList.iterator();
        int i17 = 0;
        while (it2.hasNext()) {
            try {
                try {
                    sceneGR = GR(context2, (String) it2.next(), linkedHashMap, new Function0() { // from class: LM.Sis
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return qYU.D(intRef3);
                        }
                    }, new Function0() { // from class: LM.l4Z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return qYU.a(intRef4);
                        }
                    });
                    uuidRandomUUID = UUID.randomUUID();
                    Intrinsics.checkNotNull(uuidRandomUUID);
                    fileZ = HI0.afx.Z(context2, uuidRandomUUID);
                    intRef2 = intRef4;
                    linkedHashMap2 = linkedHashMap;
                    it = it2;
                    charset2 = charset;
                    intRef = intRef3;
                    zipInputStream2 = zipInputStream3;
                    i14 = i12;
                } catch (MalformedSceneException e2) {
                    e = e2;
                    it = it2;
                    i14 = i12;
                    intRef = intRef3;
                    intRef2 = intRef4;
                    zipInputStream2 = zipInputStream3;
                    linkedHashMap2 = linkedHashMap;
                    charset2 = charset;
                }
            } catch (Throwable th5) {
                th = th5;
                zipInputStream2 = zipInputStream3;
            }
            try {
                try {
                    FilesKt.writeText$default(fileZ, SceneSerializerKt.serializeScene$default(sceneGR, false, null, false, false, templateLink, 30, null), charset2, 2, charset2);
                    i15 = j.$EnumSwitchMapping$0[sceneGR.getType().ordinal()];
                } catch (MalformedSceneException e3) {
                    e = e3;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown";
                    }
                    onImportFailed.invoke(message);
                    i8 = 1;
                    i17++;
                    it2 = it;
                    charset = charset2;
                    i12 = i14;
                    intRef3 = intRef;
                    intRef4 = intRef2;
                    linkedHashMap = linkedHashMap2;
                    zipInputStream3 = zipInputStream2;
                }
                if (i15 == i8) {
                    arrayList2.add(uuidRandomUUID);
                } else if (i15 != 2) {
                    if (i15 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList4.add(uuidRandomUUID);
                    context2 = context;
                } else {
                    arrayList3.add(uuidRandomUUID);
                }
                it2 = it;
                charset = charset2;
                i12 = i14;
                intRef3 = intRef;
                intRef4 = intRef2;
                linkedHashMap = linkedHashMap2;
                zipInputStream3 = zipInputStream2;
                i8 = 1;
                context2 = context;
            } catch (Throwable th6) {
                th = th6;
                th = th;
                zipInputStream = zipInputStream2;
                throw th;
            }
        }
        int i18 = i12;
        Ref.IntRef intRef5 = intRef3;
        Ref.IntRef intRef6 = intRef4;
        ZipInputStream zipInputStream4 = zipInputStream3;
        ?? r12 = charset;
        try {
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(zipInputStream4, r12);
            return new aC(i17, arrayList2, arrayList3, arrayList4, intRef5.element, intRef6.element, i5, i13, i18, i9);
        } catch (Throwable th7) {
            th = th7;
            zipInputStream = zipInputStream4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri Y(Context context, Scene scene, Map map, Function0 function0, Function0 function02, final Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        XoT.C.Uo(context, new Function0() { // from class: LM.Zs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qYU.dR0(uri);
            }
        });
        if (Intrinsics.areEqual(uri.getScheme(), "amproj") || Intrinsics.areEqual(uri.getScheme(), "am-docs")) {
            final MediaUriInfo mediaUriInfo = scene.getMediaInfo().get(uri);
            XoT.C.Uo(context, new Function0() { // from class: LM.O
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qYU.z(uri, mediaUriInfo);
                }
            });
            if (mediaUriInfo != null) {
                final String str = (String) map.get(mediaUriInfo.getSig());
                XoT.C.Uo(context, new Function0() { // from class: LM.QaP
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qYU.k(uri, mediaUriInfo, str);
                    }
                });
                if (str == null) {
                    function0.invoke();
                }
                Uri uri2 = Uri.parse("am:" + str);
                Intrinsics.checkNotNull(uri2);
                MediaUriInfoKt.updateCache(mediaUriInfo.copy((4094 & 1) != 0 ? mediaUriInfo.uri : uri2, (4094 & 2) != 0 ? mediaUriInfo.filename : null, (4094 & 4) != 0 ? mediaUriInfo.title : null, (4094 & 8) != 0 ? mediaUriInfo.mime : null, (4094 & 16) != 0 ? mediaUriInfo.size : 0L, (4094 & 32) != 0 ? mediaUriInfo.infoUpdated : 0L, (4094 & 64) != 0 ? mediaUriInfo.sig : null, (4094 & 128) != 0 ? mediaUriInfo.width : 0, (4094 & 256) != 0 ? mediaUriInfo.height : 0, (4094 & 512) != 0 ? mediaUriInfo.orientation : 0, (4094 & 1024) != 0 ? mediaUriInfo.duration : 0L, (4094 & 2048) != 0 ? mediaUriInfo.fphs : 0));
                return uri2;
            }
        } else if (Intrinsics.areEqual(uri.getScheme(), "sample")) {
            function02.invoke();
            return uri;
        }
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Ref.IntRef intRef) {
        intRef.element++;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scene bzg(Scene it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Scene.copy$default(it, it.getTitle() + " [1]", 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048574, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dR0(Uri uri) {
        return "unserializeAndRemapScene: Remap URI " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair e(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List listSplit$default = StringsKt.split$default((CharSequence) it, new char[]{':'}, false, 3, 2, (Object) null);
        LM.j jVar = listSplit$default.size() >= 3 ? new LM.j((String) listSplit$default.get(2), (String) listSplit$default.get(0), (String) listSplit$default.get(1)) : new LM.j((String) listSplit$default.get(1), (String) listSplit$default.get(0), (String) listSplit$default.get(0));
        return TuplesKt.to(jVar.n(), jVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        r6 = kotlin.io.TextStreamsKt.readText(new java.io.InputStreamReader(r1, kotlin.text.Charsets.UTF_8));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Map fD(File file) throws MalformedSceneException {
        String text;
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null && Intrinsics.areEqual(nextEntry.getName(), "manifest.txt")) {
                    break;
                }
                if (nextEntry == null) {
                    text = null;
                    break;
                }
            } finally {
            }
        }
        CloseableKt.closeFinally(zipInputStream, null);
        if (text != null) {
            return MapsKt.toMap(SequencesKt.map(SequencesKt.filter(StringsKt.lineSequence(text), new Function1() { // from class: LM.xZD
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(qYU.E2((String) obj));
                }
            }), new Function1() { // from class: LM.M5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qYU.e((String) obj);
                }
            }));
        }
        throw new MalformedSceneException("Project package missing manifest", null, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ijL() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(Uri uri, MediaUriInfo mediaUriInfo, String str) {
        return "unserializeAndRemapScene: Remap URI " + uri + " -> " + mediaUriInfo + " -> " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit piY() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rV9(String str, String str2) {
        return "ImportCloudProject: sigFilenameMap[" + str + "]=" + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String z(Uri uri, MediaUriInfo mediaUriInfo) {
        return "unserializeAndRemapScene: Remap URI " + uri + " -> " + mediaUriInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String B(Map map) {
        return "ImportPackagedProject: sigFilenameMap size=" + map.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String E(ZipEntry zipEntry) {
        return "ImportPackagedProject: OTHER(sig): " + zipEntry.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String FX(ZipEntry zipEntry) {
        return "ImportPackagedProject: OTHER(no sig): " + zipEntry.getName();
    }

    private static final void I(Context context, File file, Map map) {
        ZipEntry nextEntry;
        int iIntValue;
        Integer intOrNull;
        Integer intOrNull2;
        File fileGh = HI0.afx.gh(context);
        File file2 = new File(HI0.afx.ty(context), "import_packaged_project_media.tmp");
        if (file2.exists()) {
            file2.delete();
        }
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
        do {
            try {
                nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    String strSubstringAfterLast$default = StringsKt.substringAfterLast$default(name, '.', (String) null, 2, (Object) null);
                    Locale ENGLISH = Locale.ENGLISH;
                    Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                    String lowerCase = strSubstringAfterLast$default.toLowerCase(ENGLISH);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    LM.j jVar = (LM.j) map.get(nextEntry.getName());
                    if (jVar != null && f6053n.contains(lowerCase)) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        File fileResolve = FilesKt.resolve(fileGh, jVar.t() + "." + lowerCase);
                        int iIntValue2 = 0;
                        if (fileResolve.exists()) {
                            mediaMetadataRetriever.setDataSource(fileResolve.getAbsolutePath());
                        } else {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                ByteStreamsKt.copyTo$default(zipInputStream, fileOutputStream, 0, 2, null);
                                CloseableKt.closeFinally(fileOutputStream, null);
                                mediaMetadataRetriever.setDataSource(file2.getAbsolutePath());
                            } finally {
                            }
                        }
                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                        if (strExtractMetadata != null && (intOrNull2 = StringsKt.toIntOrNull(strExtractMetadata)) != null) {
                            iIntValue = intOrNull2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (strExtractMetadata2 != null && (intOrNull = StringsKt.toIntOrNull(strExtractMetadata2)) != null) {
                            iIntValue2 = intOrNull.intValue();
                        }
                        if (iIntValue == 0 || iIntValue2 == 0) {
                            FirebaseCrashlytics.getInstance().recordException(new IllegalStateException("Invalid video size metadata: width=" + strExtractMetadata + ", height=" + strExtractMetadata2));
                        }
                        int iMax = Math.max(iIntValue, iIntValue2);
                        com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
                        if (iMax <= (jVar2.getMaxResWithVideo() * 16) / 9 && Math.min(iIntValue, iIntValue2) <= jVar2.getMaxResWithVideo()) {
                            if (file2.exists()) {
                                file2.delete();
                            }
                        } else {
                            throw new VideoResolutionTooHighException(iIntValue, iIntValue2, jVar2.getMaxResWithVideo());
                        }
                    }
                }
            } finally {
            }
        } while (nextEntry != null);
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(zipInputStream, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String M(ZipEntry zipEntry) {
        return "ImportPackagedProject: XML " + zipEntry.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String M7(ZipEntry zipEntry) {
        return "ImportPackagedProject: VIDEO: " + zipEntry.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String N(String str, LM.j jVar) {
        return "ImportCloudProject: Manifest[" + str + "] filename=" + jVar.n() + " hash=" + jVar.rl() + " proxyHash=" + jVar.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String P5(ZipEntry zipEntry, LM.j jVar) {
        return "ImportPackagedProject: ENTRY -------- '" + zipEntry.getName() + "' size=" + zipEntry.getSize() + " dir=" + zipEntry.isDirectory() + " manifestEntry=" + jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String T(Map map) {
        return "ImportCloudProject: Manifest size=" + map.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String U(String str, LM.j jVar) {
        return "ImportPackagedProject: Manifest[" + str + "] filename=" + jVar.n() + " hash=" + jVar.rl() + " proxyHash=" + jVar.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String eF(ZipEntry zipEntry) {
        return "ImportPackagedProject: IMAGE: " + zipEntry.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String jB(Map map) {
        return "ImportPackagedProject: Manifest size=" + map.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nHg(ZipEntry zipEntry, LM.j jVar) {
        return "ImportCloudProject: ENTRY -------- '" + zipEntry.getName() + "' size=" + zipEntry.getSize() + " dir=" + zipEntry.isDirectory() + " manifestEntry=" + jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p5(ZipEntry zipEntry) {
        return "ImportPackagedProject: AUDIO: " + zipEntry.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String s7N(ZipEntry zipEntry) {
        return "ImportCloudProject: XML " + zipEntry.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String v(Map map) {
        return "ImportCloudProject: sigFilenameMap size=" + map.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wTp(ZipEntry zipEntry) {
        return "ImportCloudProject: OTHER(no sig): " + zipEntry.getName();
    }
}
