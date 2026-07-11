package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class TypeParameterErasureOptions {
    private final boolean intersectUpperBounds;
    private final boolean leaveNonTypeParameterTypes;

    public final boolean getIntersectUpperBounds() {
        return this.intersectUpperBounds;
    }

    public final boolean getLeaveNonTypeParameterTypes() {
        return this.leaveNonTypeParameterTypes;
    }

    public TypeParameterErasureOptions(boolean z2, boolean z3) {
        this.leaveNonTypeParameterTypes = z2;
        this.intersectUpperBounds = z3;
    }
}
