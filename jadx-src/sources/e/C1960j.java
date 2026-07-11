package e;

import com.alightcreative.app.motion.scene.SceneElement;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: e.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C1960j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f63587n;
    private final SceneElement rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f63588t;

    public C1960j(String id, SceneElement sceneElement, String title) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sceneElement, "sceneElement");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f63587n = id;
        this.rl = sceneElement;
        this.f63588t = title;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1960j)) {
            return false;
        }
        C1960j c1960j = (C1960j) obj;
        return Intrinsics.areEqual(this.f63587n, c1960j.f63587n) && Intrinsics.areEqual(this.rl, c1960j.rl) && Intrinsics.areEqual(this.f63588t, c1960j.f63588t);
    }

    public static /* synthetic */ C1960j rl(C1960j c1960j, String str, SceneElement sceneElement, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c1960j.f63587n;
        }
        if ((i2 & 2) != 0) {
            sceneElement = c1960j.rl;
        }
        if ((i2 & 4) != 0) {
            str2 = c1960j.f63588t;
        }
        return c1960j.n(str, sceneElement, str2);
    }

    public final String O() {
        return this.f63588t;
    }

    public int hashCode() {
        return (((this.f63587n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f63588t.hashCode();
    }

    public final C1960j n(String id, SceneElement sceneElement, String title) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sceneElement, "sceneElement");
        Intrinsics.checkNotNullParameter(title, "title");
        return new C1960j(id, sceneElement, title);
    }

    public final SceneElement nr() {
        return this.rl;
    }

    public final String t() {
        return this.f63587n;
    }

    public String toString() {
        return "PresetData(id=" + this.f63587n + ", sceneElement=" + this.rl + ", title=" + this.f63588t + ")";
    }

    public /* synthetic */ C1960j(String str, SceneElement sceneElement, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, sceneElement, (i2 & 4) != 0 ? sceneElement.getLabel() : str2);
    }
}
