package Q6;

import MoG.Xo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7947n;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final d2n.Wre f7948t;

    public /* synthetic */ aC(String str, List list, d2n.Wre wre, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, wre);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aC)) {
            return false;
        }
        aC aCVar = (aC) obj;
        return Xo.j.nr(this.f7947n, aCVar.f7947n) && Intrinsics.areEqual(this.rl, aCVar.rl) && Intrinsics.areEqual(this.f7948t, aCVar.f7948t);
    }

    private aC(String str, List list, d2n.Wre wre) {
        this.f7947n = str;
        this.rl = list;
        this.f7948t = wre;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("At least one instruction must be provided");
        }
        float fNr = ((CN3) CollectionsKt.first(list)).nr();
        if (fNr != 0.0f) {
            throw new IllegalArgumentException(("Invalid start index: " + fNr).toString());
        }
        List listDrop = CollectionsKt.drop(list, 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDrop, 10));
        Iterator it = listDrop.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((CN3) it.next()).nr()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            float fFloatValue = ((Number) it2.next()).floatValue();
            if (fFloatValue <= fNr) {
                throw new IllegalArgumentException(("Inconsistent indices: " + fFloatValue + ", " + fNr).toString());
            }
            fNr = fFloatValue;
        }
    }

    public int hashCode() {
        return (((Xo.j.O(this.f7947n) * 31) + this.rl.hashCode()) * 31) + this.f7948t.hashCode();
    }

    public final String n() {
        return this.f7947n;
    }

    public final d2n.Wre rl() {
        return this.f7948t;
    }

    public final List t() {
        return this.rl;
    }

    public String toString() {
        return "SoundInstruction(id=" + ((Object) Xo.j.J2(this.f7947n)) + ", sectionSoundInstructions=" + this.rl + ", rangeInComposition=" + this.f7948t + ')';
    }
}
