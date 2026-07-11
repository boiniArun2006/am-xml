package Lv;

import HI0.Q;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.app.motion.scene.Scene;
import kotlin.jvm.internal.Intrinsics;
import z.cA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class CN3 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final cA f6187O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Scene f6188n;
    private final ExportParams nr;
    private final cBL.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Q f6189t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CN3)) {
            return false;
        }
        CN3 cn3 = (CN3) obj;
        return Intrinsics.areEqual(this.f6188n, cn3.f6188n) && Intrinsics.areEqual(this.rl, cn3.rl) && Intrinsics.areEqual(this.f6189t, cn3.f6189t) && Intrinsics.areEqual(this.nr, cn3.nr) && Intrinsics.areEqual(this.f6187O, cn3.f6187O);
    }

    public CN3(Scene scene, cBL.j watermarkOptions, Q contentResolver, ExportParams exportParams, cA textureCache) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(watermarkOptions, "watermarkOptions");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(exportParams, "exportParams");
        Intrinsics.checkNotNullParameter(textureCache, "textureCache");
        this.f6188n = scene;
        this.rl = watermarkOptions;
        this.f6189t = contentResolver;
        this.nr = exportParams;
        this.f6187O = textureCache;
    }

    public static /* synthetic */ CN3 rl(CN3 cn3, Scene scene, cBL.j jVar, Q q2, ExportParams exportParams, cA cAVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            scene = cn3.f6188n;
        }
        if ((i2 & 2) != 0) {
            jVar = cn3.rl;
        }
        if ((i2 & 4) != 0) {
            q2 = cn3.f6189t;
        }
        if ((i2 & 8) != 0) {
            exportParams = cn3.nr;
        }
        if ((i2 & 16) != 0) {
            cAVar = cn3.f6187O;
        }
        cA cAVar2 = cAVar;
        Q q3 = q2;
        return cn3.n(scene, jVar, q3, exportParams, cAVar2);
    }

    public final cA J2() {
        return this.f6187O;
    }

    public final Scene O() {
        return this.f6188n;
    }

    public final cBL.j Uo() {
        return this.rl;
    }

    public int hashCode() {
        return (((((((this.f6188n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f6189t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f6187O.hashCode();
    }

    public final CN3 n(Scene scene, cBL.j watermarkOptions, Q contentResolver, ExportParams exportParams, cA textureCache) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(watermarkOptions, "watermarkOptions");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(exportParams, "exportParams");
        Intrinsics.checkNotNullParameter(textureCache, "textureCache");
        return new CN3(scene, watermarkOptions, contentResolver, exportParams, textureCache);
    }

    public final ExportParams nr() {
        return this.nr;
    }

    public final Q t() {
        return this.f6189t;
    }

    public String toString() {
        return "SceneExportCompositionInstruction(scene=" + this.f6188n + ", watermarkOptions=" + this.rl + ", contentResolver=" + this.f6189t + ", exportParams=" + this.nr + ", textureCache=" + this.f6187O + ")";
    }
}
