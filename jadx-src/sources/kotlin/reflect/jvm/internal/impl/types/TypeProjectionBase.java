package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class TypeProjectionBase implements TypeProjection {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeProjection)) {
            return false;
        }
        TypeProjection typeProjection = (TypeProjection) obj;
        return isStarProjection() == typeProjection.isStarProjection() && getProjectionKind() == typeProjection.getProjectionKind() && getType().equals(typeProjection.getType());
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2 = getProjectionKind().hashCode();
        if (TypeUtils.noExpectedType(getType())) {
            return (iHashCode2 * 31) + 19;
        }
        int i2 = iHashCode2 * 31;
        if (isStarProjection()) {
            iHashCode = 17;
        } else {
            iHashCode = getType().hashCode();
        }
        return i2 + iHashCode;
    }

    public String toString() {
        if (isStarProjection()) {
            return "*";
        }
        if (getProjectionKind() == Variance.INVARIANT) {
            return getType().toString();
        }
        return getProjectionKind() + " " + getType();
    }
}
