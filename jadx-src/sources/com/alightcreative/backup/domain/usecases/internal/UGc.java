package com.alightcreative.backup.domain.usecases.internal;

import HI0.Lu;
import HI0.afx;
import android.content.Context;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.project.ProjectInfoCache;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class UGc implements wtO.Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final wtO.Wre f46533n;
    private final Context rl;

    public UGc(wtO.Wre getCloudProjectsUseCase, Context context) {
        Intrinsics.checkNotNullParameter(getCloudProjectsUseCase, "getCloudProjectsUseCase");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46533n = getCloudProjectsUseCase;
        this.rl = context;
    }

    private final List J2() {
        return (List) this.f46533n.n().getValue();
    }

    private final Map Uo() {
        Object objM313constructorimpl;
        Map<String, ProjectInfo.n> projects;
        File cacheDir = this.rl.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File fileResolve = FilesKt.resolve(cacheDir, "pcache.json");
        ProjectInfoCache projectInfoCache = null;
        if (fileResolve.exists()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Moshi moshiN = Lu.n();
                String text$default = FilesKt.readText$default(fileResolve, null, 1, null);
                JsonAdapter jsonAdapterAdapter = moshiN.adapter(ProjectInfoCache.class);
                Intrinsics.checkNotNull(jsonAdapterAdapter);
                objM313constructorimpl = Result.m313constructorimpl((ProjectInfoCache) jsonAdapterAdapter.fromJson(text$default));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
            }
            projectInfoCache = (ProjectInfoCache) (Result.m319isFailureimpl(objM313constructorimpl) ? null : objM313constructorimpl);
        }
        return (projectInfoCache == null || (projects = projectInfoCache.getProjects()) == null) ? MapsKt.emptyMap() : projects;
    }

    @Override // wtO.Dsr
    public Map O(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        List listJ2 = J2();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listJ2, 10)), 16));
        for (Object obj : listJ2) {
            linkedHashMap.put(((ProjectInfo.j) obj).getId(), obj);
        }
        Map mapUo = Uo();
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        for (Map.Entry<String, String> entry : com.alightcreative.app.motion.persist.j.INSTANCE.getCloudToLocalIdMap().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (StringsKt.contains$default((CharSequence) value, (CharSequence) "?", false, 2, (Object) null)) {
                List listSplit$default = StringsKt.split$default((CharSequence) value, new String[]{"?"}, false, 0, 6, (Object) null);
                String str = (String) listSplit$default.get(0);
                String str2 = (String) listSplit$default.get(1);
                if (Intrinsics.areEqual(str, uid)) {
                    if (linkedHashMap.containsKey(key)) {
                        ProjectInfo.n nVar = (ProjectInfo.n) mapUo.get(str2);
                        if (nVar != null) {
                            okd.n nVarN = okd.n.f71570n.n(nVar);
                            mapCreateMapBuilder.put(str2, nVarN);
                        }
                    } else {
                        nr(key);
                    }
                }
            }
        }
        for (Map.Entry entry2 : mapUo.entrySet()) {
            if (!mapCreateMapBuilder.containsKey(entry2.getKey())) {
                mapCreateMapBuilder.put(entry2.getKey(), okd.n.f71573t);
            }
        }
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            if (!mapCreateMapBuilder.containsKey(entry3.getKey())) {
                mapCreateMapBuilder.put(entry3.getKey(), okd.n.f71568O);
            }
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    @Override // wtO.Dsr
    public void n(String uid, String localProjectId, String cloudProjectId) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(localProjectId, "localProjectId");
        Intrinsics.checkNotNullParameter(cloudProjectId, "cloudProjectId");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        jVar.getCloudToLocalIdMap().put(cloudProjectId, uid + "?" + localProjectId);
        jVar.getCloudSyncTimeMillis().put(localProjectId, Long.valueOf(afx.o(this.rl, localProjectId).lastModified()));
    }

    @Override // wtO.Dsr
    public void nr(String cloudProjectId) {
        Intrinsics.checkNotNullParameter(cloudProjectId, "cloudProjectId");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        String strRemove = jVar.getCloudToLocalIdMap().remove(cloudProjectId);
        if (strRemove != null) {
            jVar.getCloudSyncTimeMillis().remove((String) StringsKt.split$default((CharSequence) strRemove, new String[]{"?"}, false, 0, 6, (Object) null).get(1));
        }
    }

    @Override // wtO.Dsr
    public String rl(String cloudProjectId) {
        Intrinsics.checkNotNullParameter(cloudProjectId, "cloudProjectId");
        String str = com.alightcreative.app.motion.persist.j.INSTANCE.getCloudToLocalIdMap().get(cloudProjectId);
        if (str == null || !StringsKt.contains$default((CharSequence) str, (CharSequence) "?", false, 2, (Object) null)) {
            return null;
        }
        String str2 = (String) StringsKt.split$default((CharSequence) str, new String[]{"?"}, false, 0, 6, (Object) null).get(1);
        if (Uo().containsKey(str2)) {
            return str2;
        }
        nr(cloudProjectId);
        return null;
    }

    @Override // wtO.Dsr
    public String t(String uid, String localProjectId) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(localProjectId, "localProjectId");
        for (Map.Entry<String, String> entry : com.alightcreative.app.motion.persist.j.INSTANCE.getCloudToLocalIdMap().entrySet()) {
            if (Intrinsics.areEqual(entry.getValue(), uid + "?" + localProjectId)) {
                String key = entry.getKey();
                List listJ2 = J2();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listJ2, 10));
                Iterator it = listJ2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ProjectInfo.j) it.next()).getId());
                }
                if (arrayList.contains(key)) {
                    return key;
                }
                nr(key);
                return null;
            }
        }
        return null;
    }
}
