package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j2 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f56602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3 f56603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f56604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f56605d;

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final Object a() {
        return ((t0) this.f56602a.newBuilderForType()).b();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean b(Object obj, Object obj2) {
        this.f56603b.getClass();
        n3 n3Var = ((z0) obj).unknownFields;
        this.f56603b.getClass();
        if (!n3Var.equals(((z0) obj2).unknownFields)) {
            return false;
        }
        if (!this.f56604c) {
            return true;
        }
        this.f56605d.getClass();
        n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
        this.f56605d.getClass();
        return n0Var.equals(((GeneratedMessageLite$ExtendableMessage) obj2).extensions);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void c(Object obj) {
        this.f56603b.getClass();
        ((z0) obj).unknownFields.f56630e = false;
        this.f56605d.getClass();
        ((GeneratedMessageLite$ExtendableMessage) obj).extensions.e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int d(Object obj) {
        this.f56603b.getClass();
        int iHashCode = ((z0) obj).unknownFields.hashCode();
        if (!this.f56604c) {
            return iHashCode;
        }
        this.f56605d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.f56621a.hashCode() + (iHashCode * 53);
    }

    public j2(o3 o3Var, j0 j0Var, d2 d2Var) {
        this.f56603b = o3Var;
        j0Var.getClass();
        this.f56604c = d2Var instanceof GeneratedMessageLite$ExtendableMessage;
        this.f56605d = j0Var;
        this.f56602a = d2Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, Object obj2) {
        o3 o3Var = this.f56603b;
        Class cls = u2.f56681a;
        o3Var.getClass();
        z0 z0Var = (z0) obj;
        n3 n3VarA = z0Var.unknownFields;
        n3 n3Var = ((z0) obj2).unknownFields;
        if (!n3Var.equals(n3.f56625f)) {
            n3VarA = n3.a(n3VarA, n3Var);
        }
        z0Var.unknownFields = n3VarA;
        if (this.f56604c) {
            this.f56605d.getClass();
            n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
            if (n0Var.f56621a.isEmpty()) {
                return;
            }
            ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().a(n0Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int b(Object obj) {
        this.f56603b.getClass();
        n3 n3Var = ((z0) obj).unknownFields;
        int i2 = n3Var.f56629d;
        if (i2 == -1) {
            int iA = 0;
            for (int i3 = 0; i3 < n3Var.f56626a; i3++) {
                int i5 = n3Var.f56627b[i3] >>> 3;
                iA += b0.a((s) n3Var.f56628c[i3]) + b0.b(3) + b0.c(i5) + b0.b(2) + (b0.b(1) * 2);
            }
            n3Var.f56629d = iA;
            i2 = iA;
        }
        if (!this.f56604c) {
            return i2;
        }
        this.f56605d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.a() + i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, c0 c0Var) {
        this.f56605d.getClass();
        Iterator itD = ((GeneratedMessageLite$ExtendableMessage) obj).extensions.d();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            w0 w0Var = (w0) entry.getKey();
            if (w0Var.f56699c.a() == k4.MESSAGE && !w0Var.f56700d && !w0Var.f56701e) {
                int i2 = w0Var.f56698b;
                Object value = entry.getValue();
                c0Var.getClass();
                if (value instanceof s) {
                    c0Var.f56538a.b(i2, (s) value);
                } else {
                    c0Var.f56538a.a(i2, (d2) value);
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        this.f56603b.getClass();
        n3 n3Var = ((z0) obj).unknownFields;
        n3Var.getClass();
        c0Var.getClass();
        if (q4.ASCENDING == q4.DESCENDING) {
            for (int i3 = n3Var.f56626a - 1; i3 >= 0; i3--) {
                int i5 = n3Var.f56627b[i3] >>> 3;
                Object obj2 = n3Var.f56628c[i3];
                if (obj2 instanceof s) {
                    c0Var.f56538a.b(i5, (s) obj2);
                } else {
                    c0Var.f56538a.a(i5, (d2) obj2);
                }
            }
            return;
        }
        for (int i7 = 0; i7 < n3Var.f56626a; i7++) {
            int i8 = n3Var.f56627b[i7] >>> 3;
            Object obj3 = n3Var.f56628c[i7];
            if (obj3 instanceof s) {
                c0Var.f56538a.b(i8, (s) obj3);
            } else {
                c0Var.f56538a.a(i8, (d2) obj3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2 A[EDGE_INSN: B:69:0x00d2->B:43:0x00d2 BREAK  A[LOOP:1: B:17:0x0066->B:74:0x0066], SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, byte[] bArr, int i2, int i3, f fVar) throws n1 {
        int iA;
        z0 z0Var = (z0) obj;
        n3 n3Var = z0Var.unknownFields;
        if (n3Var == n3.f56625f) {
            n3Var = new n3();
            z0Var.unknownFields = n3Var;
        }
        n3 n3Var2 = n3Var;
        n0 n0VarEnsureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        x0 x0VarA = null;
        while (i2 < i3) {
            int iD = g.d(bArr, i2, fVar);
            int i5 = fVar.f56560a;
            if (i5 == 11) {
                int i7 = i3;
                f fVar2 = fVar;
                int i8 = 0;
                s sVar = null;
                while (true) {
                    if (iD >= i7) {
                        iA = iD;
                        break;
                    }
                    iA = iD + 1;
                    byte b2 = bArr[iD];
                    if (b2 >= 0) {
                        fVar2.f56560a = b2;
                    } else {
                        iA = g.a(b2, bArr, iA, fVar2);
                    }
                    int i9 = fVar2.f56560a;
                    int i10 = i9 >>> 3;
                    int i11 = i9 & 7;
                    if (i10 != 2) {
                        if (i10 == 3) {
                            if (x0VarA != null) {
                                iD = g.a(p2.f56635c.a(x0VarA.f56713c.getClass()), bArr, iA, i7, fVar2);
                                n0VarEnsureExtensionsAreMutable.c(x0VarA.f56714d, fVar2.f56562c);
                            } else if (i11 == 2) {
                                iD = g.a(bArr, iA, fVar2);
                                sVar = (s) fVar2.f56562c;
                            }
                        }
                        if (i9 != 12) {
                            break;
                        } else {
                            iD = g.a(i9, bArr, iA, i7, fVar2);
                        }
                    } else if (i11 == 0) {
                        int iA2 = iA + 1;
                        byte b4 = bArr[iA];
                        if (b4 >= 0) {
                            fVar2.f56560a = b4;
                        } else {
                            iA2 = g.a(b4, bArr, iA2, fVar2);
                        }
                        iD = iA2;
                        i8 = fVar2.f56560a;
                        j0 j0Var = this.f56605d;
                        h0 h0Var = fVar2.f56563d;
                        d2 d2Var = this.f56602a;
                        j0Var.getClass();
                        x0VarA = h0Var.a(i8, d2Var);
                    } else if (i9 != 12) {
                    }
                }
                if (sVar != null) {
                    n3Var2.a((i8 << 3) | 2, sVar);
                }
                i2 = iA;
                i3 = i7;
                fVar = fVar2;
            } else if ((i5 & 7) == 2) {
                j0 j0Var2 = this.f56605d;
                h0 h0Var2 = fVar.f56563d;
                d2 d2Var2 = this.f56602a;
                j0Var2.getClass();
                x0VarA = h0Var2.a(i5 >>> 3, d2Var2);
                if (x0VarA != null) {
                    i2 = g.a(p2.f56635c.a(x0VarA.f56713c.getClass()), bArr, iD, i3, fVar);
                    n0VarEnsureExtensionsAreMutable.c(x0VarA.f56714d, fVar.f56562c);
                } else {
                    i2 = g.a(i5, bArr, iD, i3, n3Var2, fVar);
                }
            } else {
                i2 = g.a(i5, bArr, iD, i3, fVar);
            }
        }
        if (i2 != i3) {
            throw new n1("Failed to parse the message.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, s2 s2Var, h0 h0Var) {
        o3 o3Var = this.f56603b;
        j0 j0Var = this.f56605d;
        o3Var.getClass();
        z0 z0Var = (z0) obj;
        n3 n3Var = z0Var.unknownFields;
        if (n3Var == n3.f56625f) {
            n3Var = new n3();
            z0Var.unknownFields = n3Var;
        }
        n3 n3Var2 = n3Var;
        j0Var.getClass();
        n0 n0VarEnsureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (s2Var.s() != Integer.MAX_VALUE) {
            try {
                s2 s2Var2 = s2Var;
                h0 h0Var2 = h0Var;
                if (!a(s2Var2, h0Var2, j0Var, n0VarEnsureExtensionsAreMutable, o3Var, n3Var2)) {
                    break;
                }
                s2Var = s2Var2;
                h0Var = h0Var2;
            } finally {
                z0Var.unknownFields = n3Var2;
            }
        }
    }

    public final boolean a(s2 s2Var, h0 h0Var, j0 j0Var, n0 n0Var, o3 o3Var, n3 n3Var) throws n1 {
        byte[] bArr;
        int iE = s2Var.e();
        if (iE != 11) {
            if ((iE & 7) == 2) {
                d2 d2Var = this.f56602a;
                j0Var.getClass();
                x0 x0VarA = h0Var.a(iE >>> 3, d2Var);
                if (x0VarA != null) {
                    n0Var.c(x0VarA.f56714d, s2Var.b(x0VarA.f56713c.getClass(), h0Var));
                    return true;
                }
                o3Var.getClass();
                return o3.a((Object) n3Var, s2Var);
            }
            return s2Var.i();
        }
        x0 x0VarA2 = null;
        int iC = 0;
        s sVarA = null;
        while (s2Var.s() != Integer.MAX_VALUE) {
            int iE2 = s2Var.e();
            if (iE2 == 16) {
                iC = s2Var.c();
                d2 d2Var2 = this.f56602a;
                j0Var.getClass();
                x0VarA2 = h0Var.a(iC, d2Var2);
            } else if (iE2 == 26) {
                if (x0VarA2 != null) {
                    j0Var.getClass();
                    n0Var.c(x0VarA2.f56714d, s2Var.b(x0VarA2.f56713c.getClass(), h0Var));
                } else {
                    sVarA = s2Var.a();
                }
            } else if (!s2Var.i()) {
                break;
            }
        }
        if (s2Var.e() != 12) {
            throw new n1("Protocol message end-group tag did not match expected tag.");
        }
        if (sVarA != null) {
            if (x0VarA2 != null) {
                j0Var.getClass();
                z0 z0VarB = ((t0) x0VarA2.f56713c.newBuilderForType()).b();
                int size = sVarA.size();
                if (size == 0) {
                    bArr = l1.f56613b;
                } else {
                    byte[] bArr2 = new byte[size];
                    sVarA.a(size, bArr2);
                    bArr = bArr2;
                }
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                if (byteBufferWrap.hasArray()) {
                    h hVar = new h(byteBufferWrap);
                    p2 p2Var = p2.f56635c;
                    p2Var.getClass();
                    p2Var.a(z0VarB.getClass()).a(z0VarB, hVar, h0Var);
                    n0Var.c(x0VarA2.f56714d, z0VarB);
                    if (hVar.s() != Integer.MAX_VALUE) {
                        throw new n1("Protocol message end-group tag did not match expected tag.");
                    }
                } else {
                    throw new IllegalArgumentException("Direct buffers not yet supported");
                }
            } else {
                o3Var.getClass();
                n3Var.a((iC << 3) | 2, sVarA);
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean a(Object obj) {
        this.f56605d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.c();
    }
}
