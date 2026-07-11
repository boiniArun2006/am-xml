package Rc;

import Rc.w6;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueNull;
import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class I28 extends w6 {
    private int E2 = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final BufferedSource f8691S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private String f8692T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f8693X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8694e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Buffer f8695g;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final ByteString f8688N = ByteString.encodeUtf8("'\\");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final ByteString f8690v = ByteString.encodeUtf8("\"\\");
    private static final ByteString Xw = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    private static final ByteString jB = ByteString.encodeUtf8("\n\r");

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final ByteString f8689U = ByteString.encodeUtf8("*/");

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r6.f8695g.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r2 != 47) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r6.f8691S.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        GD();
        r3 = r6.f8695g.getByte(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r3 == 42) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r6.f8695g.readByte();
        r6.f8695g.readByte();
        X4T();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r6.f8695g.readByte();
        r6.f8695g.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (UF() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        throw Org("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        GD();
        X4T();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int Bu(boolean z2) throws IOException {
        byte b2;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (!this.f8691S.request(i3)) {
                    if (z2) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                b2 = this.f8695g.getByte(i2);
                if (b2 != 10 && b2 != 32 && b2 != 13 && b2 != 9) {
                    break;
                }
                i2 = i3;
            }
        }
        return b2;
    }

    private String p0N(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jIndexOfElement = this.f8691S.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw Org("Unterminated string");
            }
            if (this.f8695g.getByte(jIndexOfElement) != 92) {
                if (sb == null) {
                    String utf8 = this.f8695g.readUtf8(jIndexOfElement);
                    this.f8695g.readByte();
                    return utf8;
                }
                sb.append(this.f8695g.readUtf8(jIndexOfElement));
                this.f8695g.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f8695g.readUtf8(jIndexOfElement));
            this.f8695g.readByte();
            sb.append(Qu());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.E2 = 0;
        this.f8701t[0] = 8;
        this.f8698n = 1;
        this.f8695g.clear();
        this.f8691S.close();
    }

    private void GD() throws n {
        if (!this.f8700r) {
            throw Org("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void HBN(ByteString byteString) throws IOException {
        while (true) {
            long jIndexOfElement = this.f8691S.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw Org("Unterminated string");
            }
            if (this.f8695g.getByte(jIndexOfElement) != 92) {
                this.f8695g.skip(jIndexOfElement + 1);
                return;
            } else {
                this.f8695g.skip(jIndexOfElement + 1);
                Qu();
            }
        }
    }

    private int How(String str, w6.j jVar) {
        int length = jVar.f8702n.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(jVar.f8702n[i2])) {
                this.E2 = 0;
                this.f8697O[this.f8698n - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    private int K() throws IOException {
        int[] iArr = this.f8701t;
        int i2 = this.f8698n;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int iBu = Bu(true);
            this.f8695g.readByte();
            if (iBu != 44) {
                if (iBu != 59) {
                    if (iBu != 93) {
                        throw Org("Unterminated array");
                    }
                    this.E2 = 4;
                    return 4;
                }
                GD();
            }
        } else {
            if (i3 == 3 || i3 == 5) {
                iArr[i2 - 1] = 4;
                if (i3 == 5) {
                    int iBu2 = Bu(true);
                    this.f8695g.readByte();
                    if (iBu2 != 44) {
                        if (iBu2 != 59) {
                            if (iBu2 != 125) {
                                throw Org("Unterminated object");
                            }
                            this.E2 = 2;
                            return 2;
                        }
                        GD();
                    }
                }
                int iBu3 = Bu(true);
                if (iBu3 == 34) {
                    this.f8695g.readByte();
                    this.E2 = 13;
                    return 13;
                }
                if (iBu3 == 39) {
                    this.f8695g.readByte();
                    GD();
                    this.E2 = 12;
                    return 12;
                }
                if (iBu3 != 125) {
                    GD();
                    if (!T3L((char) iBu3)) {
                        throw Org("Expected name");
                    }
                    this.E2 = 14;
                    return 14;
                }
                if (i3 == 5) {
                    throw Org("Expected name");
                }
                this.f8695g.readByte();
                this.E2 = 2;
                return 2;
            }
            if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int iBu4 = Bu(true);
                this.f8695g.readByte();
                if (iBu4 != 58) {
                    if (iBu4 != 61) {
                        throw Org("Expected ':'");
                    }
                    GD();
                    if (this.f8691S.request(1L) && this.f8695g.getByte(0L) == 62) {
                        this.f8695g.readByte();
                    }
                }
            } else if (i3 == 6) {
                iArr[i2 - 1] = 7;
            } else if (i3 == 7) {
                if (Bu(false) == -1) {
                    this.E2 = 18;
                    return 18;
                }
                GD();
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iBu5 = Bu(true);
        if (iBu5 == 34) {
            this.f8695g.readByte();
            this.E2 = 9;
            return 9;
        }
        if (iBu5 == 39) {
            GD();
            this.f8695g.readByte();
            this.E2 = 8;
            return 8;
        }
        if (iBu5 != 44 && iBu5 != 59) {
            if (iBu5 == 91) {
                this.f8695g.readByte();
                this.E2 = 3;
                return 3;
            }
            if (iBu5 != 93) {
                if (iBu5 == 123) {
                    this.f8695g.readByte();
                    this.E2 = 1;
                    return 1;
                }
                int iF = f();
                if (iF != 0) {
                    return iF;
                }
                int iUb = ub();
                if (iUb != 0) {
                    return iUb;
                }
                if (!T3L(this.f8695g.getByte(0L))) {
                    throw Org("Expected value");
                }
                GD();
                this.E2 = 10;
                return 10;
            }
            if (i3 == 1) {
                this.f8695g.readByte();
                this.E2 = 4;
                return 4;
            }
        }
        if (i3 != 1 && i3 != 2) {
            throw Org("Unexpected value");
        }
        GD();
        this.E2 = 7;
        return 7;
    }

    private char Qu() throws n, EOFException {
        int i2;
        if (!this.f8691S.request(1L)) {
            throw Org("Unterminated escape sequence");
        }
        byte b2 = this.f8695g.readByte();
        if (b2 == 10 || b2 == 34 || b2 == 39 || b2 == 47 || b2 == 92) {
            return (char) b2;
        }
        if (b2 == 98) {
            return '\b';
        }
        if (b2 == 102) {
            return '\f';
        }
        if (b2 == 110) {
            return '\n';
        }
        if (b2 == 114) {
            return '\r';
        }
        if (b2 == 116) {
            return '\t';
        }
        if (b2 != 117) {
            if (this.f8700r) {
                return (char) b2;
            }
            throw Org("Invalid escape sequence: \\" + ((char) b2));
        }
        if (!this.f8691S.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte b4 = this.f8695g.getByte(i3);
            char c4 = (char) (c2 << 4);
            if (b4 >= 48 && b4 <= 57) {
                i2 = b4 - 48;
            } else if (b4 >= 97 && b4 <= 102) {
                i2 = b4 - 87;
            } else {
                if (b4 < 65 || b4 > 70) {
                    throw Org("\\u" + this.f8695g.readUtf8(4L));
                }
                i2 = b4 - 55;
            }
            c2 = (char) (c4 + i2);
        }
        this.f8695g.skip(4L);
        return c2;
    }

    private boolean T3L(int i2) throws n {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        GD();
        return false;
    }

    private boolean UF() throws IOException {
        BufferedSource bufferedSource = this.f8691S;
        ByteString byteString = f8689U;
        long jIndexOf = bufferedSource.indexOf(byteString);
        boolean z2 = jIndexOf != -1;
        Buffer buffer = this.f8695g;
        buffer.skip(z2 ? jIndexOf + ((long) byteString.size()) : buffer.size());
        return z2;
    }

    private String Uf() throws IOException {
        long jIndexOfElement = this.f8691S.indexOfElement(Xw);
        return jIndexOfElement != -1 ? this.f8695g.readUtf8(jIndexOfElement) : this.f8695g.readUtf8();
    }

    private void X4T() throws IOException {
        long jIndexOfElement = this.f8691S.indexOfElement(jB);
        Buffer buffer = this.f8695g;
        buffer.skip(jIndexOfElement != -1 ? jIndexOfElement + 1 : buffer.size());
    }

    private void Zmq() throws IOException {
        long jIndexOfElement = this.f8691S.indexOfElement(Xw);
        Buffer buffer = this.f8695g;
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        buffer.skip(jIndexOfElement);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int f() throws EOFException {
        String str;
        String str2;
        int i2;
        byte b2 = this.f8695g.getByte(0L);
        if (b2 == 116 || b2 == 84) {
            str = "true";
            str2 = "TRUE";
            i2 = 5;
        } else if (b2 == 102 || b2 == 70) {
            str = V8ValueBoolean.FALSE;
            str2 = "FALSE";
            i2 = 6;
        } else {
            if (b2 != 110 && b2 != 78) {
                return 0;
            }
            str = V8ValueNull.NULL;
            str2 = "NULL";
            i2 = 7;
        }
        int length = str.length();
        int i3 = 1;
        while (i3 < length) {
            int i5 = i3 + 1;
            if (!this.f8691S.request(i5)) {
                return 0;
            }
            byte b4 = this.f8695g.getByte(i3);
            if (b4 != str.charAt(i3) && b4 != str2.charAt(i3)) {
                return 0;
            }
            i3 = i5;
        }
        if (this.f8691S.request(length + 1) && T3L(this.f8695g.getByte(length))) {
            return 0;
        }
        this.f8695g.skip(length);
        this.E2 = i2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        if (T3L(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (r6 != 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r7 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
    
        if (r10 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
    
        if (r8 != r16) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
    
        if (r10 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
    
        if (r10 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a0, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:
    
        r19.f8694e = r8;
        r19.f8695g.skip(r5);
        r19.E2 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ad, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
    
        if (r6 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b0, code lost:
    
        if (r6 == 4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b3, code lost:
    
        if (r6 != 7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b6, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b7, code lost:
    
        r19.f8693X = r5;
        r19.E2 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00be, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int ub() throws EOFException {
        long j2;
        int i2;
        boolean z2 = true;
        int i3 = 0;
        char c2 = 0;
        long j3 = 0;
        boolean z3 = false;
        while (true) {
            int i5 = i3 + 1;
            if (!this.f8691S.request(i5)) {
                j2 = 0;
                i2 = 0;
                break;
            }
            j2 = 0;
            byte b2 = this.f8695g.getByte(i3);
            i2 = 0;
            if (b2 != 43) {
                if (b2 == 69 || b2 == 101) {
                    if (c2 != 2 && c2 != 4) {
                        return 0;
                    }
                    c2 = 5;
                } else if (b2 != 45) {
                    if (b2 != 46) {
                        if (b2 < 48 || b2 > 57) {
                            break;
                        }
                        if (c2 == 1 || c2 == 0) {
                            j3 = -(b2 - 48);
                            c2 = 2;
                        } else if (c2 == 2) {
                            if (j3 == 0) {
                                return 0;
                            }
                            long j4 = (10 * j3) - ((long) (b2 - 48));
                            z2 &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j4 < j3);
                            j3 = j4;
                        } else if (c2 == 3) {
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            c2 = 7;
                        }
                    } else {
                        if (c2 != 2) {
                            return 0;
                        }
                        c2 = 3;
                    }
                } else if (c2 == 0) {
                    c2 = 1;
                    z3 = true;
                } else if (c2 != 5) {
                    return 0;
                }
                i3 = i5;
            } else if (c2 != 5) {
                return 0;
            }
            c2 = 6;
            i3 = i5;
        }
    }

    @Override // Rc.w6
    public String M() throws IOException {
        String utf8;
        int iK = this.E2;
        if (iK == 0) {
            iK = K();
        }
        if (iK == 10) {
            utf8 = Uf();
        } else if (iK == 9) {
            utf8 = p0N(f8690v);
        } else if (iK == 8) {
            utf8 = p0N(f8688N);
        } else if (iK == 11) {
            utf8 = this.f8692T;
            this.f8692T = null;
        } else if (iK == 16) {
            utf8 = Long.toString(this.f8694e);
        } else {
            if (iK != 17) {
                throw new j("Expected a string but was " + a() + " at path " + getPath());
            }
            utf8 = this.f8695g.readUtf8(this.f8693X);
        }
        this.E2 = 0;
        int[] iArr = this.J2;
        int i2 = this.f8698n - 1;
        iArr[i2] = iArr[i2] + 1;
        return utf8;
    }

    @Override // Rc.w6
    public double M7() throws IOException {
        int iK = this.E2;
        if (iK == 0) {
            iK = K();
        }
        if (iK == 16) {
            this.E2 = 0;
            int[] iArr = this.J2;
            int i2 = this.f8698n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f8694e;
        }
        if (iK == 17) {
            this.f8692T = this.f8695g.readUtf8(this.f8693X);
        } else if (iK == 9) {
            this.f8692T = p0N(f8690v);
        } else if (iK == 8) {
            this.f8692T = p0N(f8688N);
        } else if (iK == 10) {
            this.f8692T = Uf();
        } else if (iK != 11) {
            throw new j("Expected a double but was " + a() + " at path " + getPath());
        }
        this.E2 = 11;
        try {
            double d2 = Double.parseDouble(this.f8692T);
            if (this.f8700r || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
                this.f8692T = null;
                this.E2 = 0;
                int[] iArr2 = this.J2;
                int i3 = this.f8698n - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return d2;
            }
            throw new n("JSON forbids NaN and infinities: " + d2 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new j("Expected a double but was " + this.f8692T + " at path " + getPath());
        }
    }

    @Override // Rc.w6
    public int Mx(w6.j jVar) throws IOException {
        int iK = this.E2;
        if (iK == 0) {
            iK = K();
        }
        if (iK < 12 || iK > 15) {
            return -1;
        }
        if (iK == 15) {
            return How(this.f8692T, jVar);
        }
        int iSelect = this.f8691S.select(jVar.rl);
        if (iSelect != -1) {
            this.E2 = 0;
            this.f8697O[this.f8698n - 1] = jVar.f8702n[iSelect];
            return iSelect;
        }
        String str = this.f8697O[this.f8698n - 1];
        String strEF = eF();
        int iHow = How(strEF, jVar);
        if (iHow == -1) {
            this.E2 = 15;
            this.f8692T = strEF;
            this.f8697O[this.f8698n - 1] = str;
        }
        return iHow;
    }

    @Override // Rc.w6
    public void T() throws IOException {
        int iK = this.E2;
        if (iK == 0) {
            iK = K();
        }
        if (iK != 2) {
            throw new j("Expected END_OBJECT but was " + a() + " at path " + getPath());
        }
        int i2 = this.f8698n;
        int i3 = i2 - 1;
        this.f8698n = i3;
        this.f8697O[i3] = null;
        int[] iArr = this.J2;
        int i5 = i2 - 2;
        iArr[i5] = iArr[i5] + 1;
        this.E2 = 0;
    }

    @Override // Rc.w6
    public boolean U() throws IOException {
        int iK = this.E2;
        if (iK == 0) {
            iK = K();
        }
        if (iK == 5) {
            this.E2 = 0;
            int[] iArr = this.J2;
            int i2 = this.f8698n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iK == 6) {
            this.E2 = 0;
            int[] iArr2 = this.J2;
            int i3 = this.f8698n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new j("Expected a boolean but was " + a() + " at path " + getPath());
    }

    @Override // Rc.w6
    public void Uo() throws IOException {
        int iK = this.E2;
        if (iK == 0) {
            iK = K();
        }
        if (iK == 1) {
            z(3);
            this.E2 = 0;
            return;
        }
        throw new j("Expected BEGIN_OBJECT but was " + a() + " at path " + getPath());
    }

    @Override // Rc.w6
    public void Z() throws IOException {
        int iK = this.E2;
        if (iK == 0) {
            iK = K();
        }
        if (iK != 4) {
            throw new j("Expected END_ARRAY but was " + a() + " at path " + getPath());
        }
        int i2 = this.f8698n;
        this.f8698n = i2 - 1;
        int[] iArr = this.J2;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.E2 = 0;
    }

    @Override // Rc.w6
    public w6.n a() throws IOException {
        int iK = this.E2;
        if (iK == 0) {
            iK = K();
        }
        switch (iK) {
            case 1:
                return w6.n.BEGIN_OBJECT;
            case 2:
                return w6.n.END_OBJECT;
            case 3:
                return w6.n.BEGIN_ARRAY;
            case 4:
                return w6.n.END_ARRAY;
            case 5:
            case 6:
                return w6.n.BOOLEAN;
            case 7:
                return w6.n.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return w6.n.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return w6.n.NAME;
            case 16:
            case 17:
                return w6.n.NUMBER;
            case 18:
                return w6.n.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // Rc.w6
    public String eF() throws IOException {
        String strP0N;
        int iK = this.E2;
        if (iK == 0) {
            iK = K();
        }
        if (iK == 14) {
            strP0N = Uf();
        } else if (iK == 13) {
            strP0N = p0N(f8690v);
        } else if (iK == 12) {
            strP0N = p0N(f8688N);
        } else {
            if (iK != 15) {
                throw new j("Expected a name but was " + a() + " at path " + getPath());
            }
            strP0N = this.f8692T;
        }
        this.E2 = 0;
        this.f8697O[this.f8698n - 1] = strP0N;
        return strP0N;
    }

    @Override // Rc.w6
    public void fcU() throws IOException {
        if (this.f8699o) {
            throw new j("Cannot skip unexpected " + a() + " at " + getPath());
        }
        int iK = this.E2;
        if (iK == 0) {
            iK = K();
        }
        if (iK == 14) {
            Zmq();
        } else if (iK == 13) {
            HBN(f8690v);
        } else if (iK == 12) {
            HBN(f8688N);
        } else if (iK != 15) {
            throw new j("Expected a name but was " + a() + " at path " + getPath());
        }
        this.E2 = 0;
        this.f8697O[this.f8698n - 1] = V8ValueNull.NULL;
    }

    @Override // Rc.w6
    public boolean jB() throws IOException {
        int iK = this.E2;
        if (iK == 0) {
            iK = K();
        }
        return (iK == 2 || iK == 4 || iK == 18) ? false : true;
    }

    @Override // Rc.w6
    public void n1() throws IOException {
        if (this.f8699o) {
            throw new j("Cannot skip unexpected " + a() + " at " + getPath());
        }
        int i2 = 0;
        do {
            int iK = this.E2;
            if (iK == 0) {
                iK = K();
            }
            if (iK == 3) {
                z(1);
            } else if (iK == 1) {
                z(3);
            } else {
                if (iK == 4) {
                    i2--;
                    if (i2 < 0) {
                        throw new j("Expected a value but was " + a() + " at path " + getPath());
                    }
                    this.f8698n--;
                } else if (iK == 2) {
                    i2--;
                    if (i2 < 0) {
                        throw new j("Expected a value but was " + a() + " at path " + getPath());
                    }
                    this.f8698n--;
                } else if (iK == 14 || iK == 10) {
                    Zmq();
                } else if (iK == 9 || iK == 13) {
                    HBN(f8690v);
                } else if (iK == 8 || iK == 12) {
                    HBN(f8688N);
                } else if (iK == 17) {
                    this.f8695g.skip(this.f8693X);
                } else if (iK == 18) {
                    throw new j("Expected a value but was " + a() + " at path " + getPath());
                }
                this.E2 = 0;
            }
            i2++;
            this.E2 = 0;
        } while (i2 != 0);
        int[] iArr = this.J2;
        int i3 = this.f8698n;
        int i5 = i3 - 1;
        iArr[i5] = iArr[i5] + 1;
        this.f8697O[i3 - 1] = V8ValueNull.NULL;
    }

    @Override // Rc.w6
    public int p5() throws IOException {
        int iK = this.E2;
        if (iK == 0) {
            iK = K();
        }
        if (iK == 16) {
            long j2 = this.f8694e;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.E2 = 0;
                int[] iArr = this.J2;
                int i3 = this.f8698n - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new j("Expected an int but was " + this.f8694e + " at path " + getPath());
        }
        if (iK == 17) {
            this.f8692T = this.f8695g.readUtf8(this.f8693X);
        } else if (iK == 9 || iK == 8) {
            String strP0N = iK == 9 ? p0N(f8690v) : p0N(f8688N);
            this.f8692T = strP0N;
            try {
                int i5 = Integer.parseInt(strP0N);
                this.E2 = 0;
                int[] iArr2 = this.J2;
                int i7 = this.f8698n - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return i5;
            } catch (NumberFormatException unused) {
            }
        } else if (iK != 11) {
            throw new j("Expected an int but was " + a() + " at path " + getPath());
        }
        this.E2 = 11;
        try {
            double d2 = Double.parseDouble(this.f8692T);
            int i8 = (int) d2;
            if (i8 == d2) {
                this.f8692T = null;
                this.E2 = 0;
                int[] iArr3 = this.J2;
                int i9 = this.f8698n - 1;
                iArr3[i9] = iArr3[i9] + 1;
                return i8;
            }
            throw new j("Expected an int but was " + this.f8692T + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new j("Expected an int but was " + this.f8692T + " at path " + getPath());
        }
    }

    @Override // Rc.w6
    public void rl() throws IOException {
        int iK = this.E2;
        if (iK == 0) {
            iK = K();
        }
        if (iK == 3) {
            z(1);
            this.J2[this.f8698n - 1] = 0;
            this.E2 = 0;
        } else {
            throw new j("Expected BEGIN_ARRAY but was " + a() + " at path " + getPath());
        }
    }

    public String toString() {
        return "JsonReader(" + this.f8691S + ")";
    }

    I28(BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            this.f8691S = bufferedSource;
            this.f8695g = bufferedSource.getBufferField();
            z(6);
            return;
        }
        throw new NullPointerException("source == null");
    }
}
