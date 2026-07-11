package com.alightcreative.app.motion.project;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/alightcreative/app/motion/project/ProjectInfoCache;", "", "", "appver", "", "", "Lcom/alightcreative/app/motion/project/ProjectInfo$n;", "projects", "<init>", "(ILjava/util/Map;)V", "component1", "()I", "component2", "()Ljava/util/Map;", "copy", "(ILjava/util/Map;)Lcom/alightcreative/app/motion/project/ProjectInfoCache;", "toString", "()Ljava/lang/String;", "hashCode", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "I", "getAppver", "Ljava/util/Map;", "getProjects", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProjectInfoCache {
    public static final int $stable = 8;
    private final int appver;
    private final Map<String, ProjectInfo.n> projects;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProjectInfoCache copy$default(ProjectInfoCache projectInfoCache, int i2, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = projectInfoCache.appver;
        }
        if ((i3 & 2) != 0) {
            map = projectInfoCache.projects;
        }
        return projectInfoCache.copy(i2, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAppver() {
        return this.appver;
    }

    public final Map<String, ProjectInfo.n> component2() {
        return this.projects;
    }

    public final ProjectInfoCache copy(int appver, Map<String, ProjectInfo.n> projects) {
        Intrinsics.checkNotNullParameter(projects, "projects");
        return new ProjectInfoCache(appver, projects);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectInfoCache)) {
            return false;
        }
        ProjectInfoCache projectInfoCache = (ProjectInfoCache) other;
        return this.appver == projectInfoCache.appver && Intrinsics.areEqual(this.projects, projectInfoCache.projects);
    }

    public int hashCode() {
        return (Integer.hashCode(this.appver) * 31) + this.projects.hashCode();
    }

    public String toString() {
        return "ProjectInfoCache(appver=" + this.appver + ", projects=" + this.projects + ")";
    }

    public ProjectInfoCache(int i2, Map<String, ProjectInfo.n> projects) {
        Intrinsics.checkNotNullParameter(projects, "projects");
        this.appver = i2;
        this.projects = projects;
    }

    public final int getAppver() {
        return this.appver;
    }

    public final Map<String, ProjectInfo.n> getProjects() {
        return this.projects;
    }
}
