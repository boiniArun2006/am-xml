package Vst;

import java.util.Arrays;
import pUk.C;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class j extends I28 {
    private final byte[] J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final byte[] f11348O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f11349n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C f11350t;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I28) {
            I28 i28 = (I28) obj;
            if (this.f11349n == i28.Uo() && this.f11350t.equals(i28.J2())) {
                boolean z2 = i28 instanceof j;
                if (Arrays.equals(this.f11348O, z2 ? ((j) i28).f11348O : i28.t())) {
                    if (Arrays.equals(this.J2, z2 ? ((j) i28).J2 : i28.nr())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // Vst.I28
    public C J2() {
        return this.f11350t;
    }

    @Override // Vst.I28
    public int Uo() {
        return this.f11349n;
    }

    public int hashCode() {
        return ((((((this.f11349n ^ 1000003) * 1000003) ^ this.f11350t.hashCode()) * 1000003) ^ Arrays.hashCode(this.f11348O)) * 1000003) ^ Arrays.hashCode(this.J2);
    }

    @Override // Vst.I28
    public byte[] nr() {
        return this.J2;
    }

    @Override // Vst.I28
    public byte[] t() {
        return this.f11348O;
    }

    public String toString() {
        return "IndexEntry{indexId=" + this.f11349n + ", documentKey=" + this.f11350t + ", arrayValue=" + Arrays.toString(this.f11348O) + ", directionalValue=" + Arrays.toString(this.J2) + "}";
    }

    j(int i2, C c2, byte[] bArr, byte[] bArr2) {
        this.f11349n = i2;
        if (c2 != null) {
            this.f11350t = c2;
            if (bArr != null) {
                this.f11348O = bArr;
                if (bArr2 != null) {
                    this.J2 = bArr2;
                    return;
                }
                throw new NullPointerException("Null directionalValue");
            }
            throw new NullPointerException("Null arrayValue");
        }
        throw new NullPointerException("Null documentKey");
    }
}
