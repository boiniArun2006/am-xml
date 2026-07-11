package com.alightcreative.app.motion.project;

import HI0.Lu;
import HI0.afx;
import HI0.l4Z;
import XoT.C;
import android.app.Activity;
import com.alightcreative.app.motion.persist.j;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.Moshi;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ExecutorService f45886n = Executors.newSingleThreadExecutor();

    public static final class Ml implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Long.valueOf(((ProjectInfo.n) obj2).getLastModified()), Long.valueOf(((ProjectInfo.n) obj).getLastModified()));
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.project.j$j, reason: collision with other inner class name */
    public /* synthetic */ class C0649j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.qz.values().length];
            try {
                iArr[j.qz.f45870n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.qz.f45872t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.qz.f45869O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class n implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String title = ((ProjectInfo.n) obj).getTitle();
            Locale locale = Locale.ROOT;
            String lowerCase = title.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((ProjectInfo.n) obj2).getTitle().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            return ComparisonsKt.compareValues(lowerCase, lowerCase2);
        }
    }

    public static final class w6 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Long.valueOf(((ProjectInfo.n) obj).getLastModified()), Long.valueOf(((ProjectInfo.n) obj2).getLastModified()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProjectInfo.n HI(String str, Activity activity, final File file) {
        if (!file.exists()) {
            return null;
        }
        try {
            Intrinsics.checkNotNull(file);
            final String text$default = FilesKt.readText$default(file, null, 1, null);
            try {
                Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(text$default, false, true, false, 10, null);
                String title = sceneUnserializeScene$default.getTitle();
                int width = sceneUnserializeScene$default.getWidth();
                int height = sceneUnserializeScene$default.getHeight();
                int totalTime = sceneUnserializeScene$default.getTotalTime();
                int framesPerHundredSeconds = sceneUnserializeScene$default.getFramesPerHundredSeconds();
                long jLastModified = file.lastModified();
                long length = file.length();
                SceneType type = sceneUnserializeScene$default.getType();
                Iterator<T> it = sceneUnserializeScene$default.getMediaInfo().values().iterator();
                long size = 0;
                while (it.hasNext()) {
                    size += ((MediaUriInfo) it.next()).getSize();
                }
                return new ProjectInfo.n(str, title, width, height, totalTime, framesPerHundredSeconds, jLastModified, length, type, size, sceneUnserializeScene$default.getFormatVersion(), sceneUnserializeScene$default.getTemplateLink());
            } catch (MalformedSceneException e2) {
                final StringWriter stringWriter = new StringWriter();
                e2.printStackTrace(new PrintWriter(stringWriter));
                C.HI(activity, new Function0() { // from class: LM.l3D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.alightcreative.app.motion.project.j.ck(stringWriter, text$default);
                    }
                });
                return null;
            }
        } catch (IOException unused) {
            C.HI(activity, new Function0() { // from class: LM.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.alightcreative.app.motion.project.j.Ik(file);
                }
            });
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String XQ() {
        return "projectListRefresher : Sync OUT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Z() {
        return "projectListRefresher : Sync IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String az() {
        return "projectListRefresher : ASYNC IN";
    }

    public static final l4Z gh(final Activity activity, final Function1 onRefresh) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        return new l4Z(f45886n, new Function0() { // from class: LM.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.app.motion.project.j.qie(activity);
            }
        }).KN(new Function1() { // from class: LM.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.app.motion.project.j.o(activity, onRefresh, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Activity activity, Function1 function1, List projects) {
        Intrinsics.checkNotNullParameter(projects, "projects");
        C.Uo(activity, new Function0() { // from class: LM.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.app.motion.project.j.Z();
            }
        });
        function1.invoke(projects);
        C.Uo(activity, new Function0() { // from class: LM.QJ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.app.motion.project.j.XQ();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List qie(final Activity activity) {
        ProjectInfoCache projectInfoCache;
        List listSortedWith;
        Object next;
        Map<String, ProjectInfo.n> projects;
        File cacheDir = activity.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File fileResolve = FilesKt.resolve(cacheDir, "pcache.json");
        if (fileResolve.exists()) {
            try {
                Moshi moshiN = Lu.n();
                String text$default = FilesKt.readText$default(fileResolve, null, 1, null);
                JsonAdapter jsonAdapterAdapter = moshiN.adapter(ProjectInfoCache.class);
                Intrinsics.checkNotNull(jsonAdapterAdapter);
                projectInfoCache = (ProjectInfoCache) jsonAdapterAdapter.fromJson(text$default);
            } catch (JsonDataException | IOException unused) {
                projectInfoCache = null;
            }
        } else {
            projectInfoCache = null;
        }
        C.Uo(activity, new Function0() { // from class: LM.qz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.app.motion.project.j.az();
            }
        });
        File[] fileArrListFiles = afx.az(activity).listFiles(new FileFilter() { // from class: LM.Pl
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return com.alightcreative.app.motion.project.j.ty(file);
            }
        });
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList<File> arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            Intrinsics.checkNotNull(file);
            if (Intrinsics.areEqual(FilesKt.getExtension(file), "xml")) {
                arrayList.add(file);
            }
        }
        ArrayList<File> arrayList2 = new ArrayList();
        for (File file2 : fileArrListFiles) {
            Intrinsics.checkNotNull(file2);
            if (Intrinsics.areEqual(FilesKt.getExtension(file2), "xmlbak")) {
                arrayList2.add(file2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (File file3 : fileArrListFiles) {
            Intrinsics.checkNotNull(file3);
            if (Intrinsics.areEqual(FilesKt.getExtension(file3), "xmltmp")) {
                arrayList3.add(file3);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (File file4 : arrayList) {
            Intrinsics.checkNotNull(file4);
            arrayList4.add(FilesKt.getNameWithoutExtension(file4));
        }
        Set set = CollectionsKt.toSet(arrayList4);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (File file5 : arrayList2) {
            Intrinsics.checkNotNull(file5);
            arrayList5.add(FilesKt.getNameWithoutExtension(file5));
        }
        Set set2 = CollectionsKt.toSet(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj : arrayList2) {
            File file6 = (File) obj;
            Intrinsics.checkNotNull(file6);
            if (!set.contains(FilesKt.getNameWithoutExtension(file6))) {
                arrayList6.add(obj);
            }
        }
        List listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList6);
        ArrayList arrayList7 = new ArrayList();
        for (Object obj2 : arrayList3) {
            File file7 = (File) obj2;
            Intrinsics.checkNotNull(file7);
            if (!set.contains(FilesKt.getNameWithoutExtension(file7)) && !set2.contains(FilesKt.getNameWithoutExtension(file7))) {
                arrayList7.add(obj2);
            }
        }
        List<File> listPlus2 = CollectionsKt.plus((Collection) listPlus, (Iterable) arrayList7);
        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus2, 10));
        for (File file8 : listPlus2) {
            Intrinsics.checkNotNull(file8);
            final String nameWithoutExtension = FilesKt.getNameWithoutExtension(file8);
            ProjectInfo.n nVar = (projectInfoCache == null || (projects = projectInfoCache.getProjects()) == null) ? null : projects.get(nameWithoutExtension);
            if (nVar == null || nVar.n() == -1 || nVar.getLastModified() != file8.lastModified()) {
                Iterator it = SequencesKt.map(SequencesKt.sequenceOf(file8, afx.XQ(activity, nameWithoutExtension), afx.WPU(activity, nameWithoutExtension), afx.Ik(activity, nameWithoutExtension)), new Function1() { // from class: LM.Xo
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return com.alightcreative.app.motion.project.j.HI(nameWithoutExtension, activity, (File) obj3);
                    }
                }).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((ProjectInfo.n) next) != null) {
                        break;
                    }
                }
                nVar = (ProjectInfo.n) next;
                if (nVar == null) {
                    nVar = new ProjectInfo.n(nameWithoutExtension, "ERROR", 0, 0, 0, 0, file8.lastModified(), file8.length(), SceneType.SCENE, 0L, 0, null);
                }
            }
            arrayList8.add(nVar);
        }
        int i2 = C0649j.$EnumSwitchMapping$0[com.alightcreative.app.motion.persist.j.INSTANCE.getProjectSortOrder().ordinal()];
        if (i2 == 1) {
            listSortedWith = CollectionsKt.sortedWith(arrayList8, new n());
        } else if (i2 == 2) {
            listSortedWith = CollectionsKt.sortedWith(arrayList8, new w6());
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            listSortedWith = CollectionsKt.sortedWith(arrayList8, new Ml());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10)), 16));
        for (Object obj3 : listSortedWith) {
            linkedHashMap.put(((ProjectInfo.n) obj3).getId(), obj3);
        }
        ProjectInfoCache projectInfoCache2 = new ProjectInfoCache(1028425, linkedHashMap);
        JsonAdapter jsonAdapterAdapter2 = Lu.n().adapter(ProjectInfoCache.class);
        Intrinsics.checkNotNull(jsonAdapterAdapter2);
        String json = jsonAdapterAdapter2.toJson(projectInfoCache2);
        Intrinsics.checkNotNull(json);
        FilesKt.writeText$default(fileResolve, json, null, 2, null);
        File cacheDir2 = IvA.n.rl().getApplicationContext().getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir2, "getCacheDir(...)");
        File fileResolve2 = FilesKt.resolve(cacheDir2, "project_thumbs");
        if (fileResolve2.exists()) {
            ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
            Iterator it2 = listSortedWith.iterator();
            while (true) {
                String str = "jpg";
                if (!it2.hasNext()) {
                    break;
                }
                ProjectInfo.n nVar2 = (ProjectInfo.n) it2.next();
                String id = nVar2.getId();
                long lastModified = nVar2.getLastModified();
                if (nVar2.getType() == SceneType.ELEMENT) {
                    str = "png";
                }
                arrayList9.add(FilesKt.resolve(fileResolve2, id + "_" + lastModified + "." + str));
            }
            File[] fileArrListFiles2 = fileResolve2.listFiles();
            if (fileArrListFiles2 != null) {
                ArrayList arrayList10 = new ArrayList();
                for (File file9 : fileArrListFiles2) {
                    Intrinsics.checkNotNull(file9);
                    if (Intrinsics.areEqual(FilesKt.getExtension(file9), "jpg") || Intrinsics.areEqual(FilesKt.getExtension(file9), "webp") || Intrinsics.areEqual(FilesKt.getExtension(file9), "png")) {
                        arrayList10.add(file9);
                    }
                }
                Iterator it3 = CollectionsKt.minus((Iterable) arrayList10, (Iterable) CollectionsKt.toSet(arrayList9)).iterator();
                while (it3.hasNext()) {
                    ((File) it3.next()).delete();
                }
            }
        }
        C.Uo(activity, new Function0() { // from class: LM.eO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.app.motion.project.j.r();
            }
        });
        return listSortedWith;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r() {
        return "projectListRefresher : ASYNC OUT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Ik(File file) {
        return "Error reading project file: " + file.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ck(StringWriter stringWriter, String str) {
        return "Error loading project\n" + ((Object) stringWriter.getBuffer()) + "\n---\n" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ty(File file) {
        return file.isFile();
    }
}
