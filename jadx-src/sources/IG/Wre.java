package IG;

import KA9.u;
import com.alightcreative.app.motion.scene.SceneType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Wre {
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f4125O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f4126n;
    private final u nr;
    private final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SceneType f4127t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wre)) {
            return false;
        }
        Wre wre = (Wre) obj;
        return this.f4126n == wre.f4126n && this.rl == wre.rl && this.f4127t == wre.f4127t && this.nr == wre.nr && this.f4125O == wre.f4125O && this.J2 == wre.J2;
    }

    public Wre(boolean z2, j jVar, SceneType selectedSceneType, u selectedSortOption, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(selectedSceneType, "selectedSceneType");
        Intrinsics.checkNotNullParameter(selectedSortOption, "selectedSortOption");
        this.f4126n = z2;
        this.rl = jVar;
        this.f4127t = selectedSceneType;
        this.nr = selectedSortOption;
        this.f4125O = z3;
        this.J2 = z4;
    }

    public static /* synthetic */ Wre rl(Wre wre, boolean z2, j jVar, SceneType sceneType, u uVar, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = wre.f4126n;
        }
        if ((i2 & 2) != 0) {
            jVar = wre.rl;
        }
        if ((i2 & 4) != 0) {
            sceneType = wre.f4127t;
        }
        if ((i2 & 8) != 0) {
            uVar = wre.nr;
        }
        if ((i2 & 16) != 0) {
            z3 = wre.f4125O;
        }
        if ((i2 & 32) != 0) {
            z4 = wre.J2;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        return wre.n(z2, jVar, sceneType, uVar, z5, z6);
    }

    public final boolean J2() {
        return this.f4126n;
    }

    public final boolean KN() {
        return this.J2;
    }

    public final u O() {
        return this.nr;
    }

    public final boolean Uo() {
        return this.f4125O;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f4126n) * 31;
        j jVar = this.rl;
        return ((((((((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31) + this.f4127t.hashCode()) * 31) + this.nr.hashCode()) * 31) + Boolean.hashCode(this.f4125O)) * 31) + Boolean.hashCode(this.J2);
    }

    public final Wre n(boolean z2, j jVar, SceneType selectedSceneType, u selectedSortOption, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(selectedSceneType, "selectedSceneType");
        Intrinsics.checkNotNullParameter(selectedSortOption, "selectedSortOption");
        return new Wre(z2, jVar, selectedSceneType, selectedSortOption, z3, z4);
    }

    public final SceneType nr() {
        return this.f4127t;
    }

    public final j t() {
        return this.rl;
    }

    public String toString() {
        return "EditViewModelState(isAddTemplateVisited=" + this.f4126n + ", bottomSheetCollection=" + this.rl + ", selectedSceneType=" + this.f4127t + ", selectedSortOption=" + this.nr + ", isPopupMenuNewTagVisible=" + this.f4125O + ", isSavePresetNewTagVisible=" + this.J2 + ")";
    }
}
