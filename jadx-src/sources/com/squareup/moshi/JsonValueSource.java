package com.squareup.moshi;

import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class JsonValueSource implements Source {
    private final Buffer buffer;
    private boolean closed;
    private long limit;
    private final Buffer prefix;
    private final BufferedSource source;
    private int stackSize;
    private ByteString state;
    static final ByteString STATE_JSON = ByteString.encodeUtf8("[]{}\"'/#");
    static final ByteString STATE_SINGLE_QUOTED = ByteString.encodeUtf8("'\\");
    static final ByteString STATE_DOUBLE_QUOTED = ByteString.encodeUtf8("\"\\");
    static final ByteString STATE_END_OF_LINE_COMMENT = ByteString.encodeUtf8("\r\n");
    static final ByteString STATE_C_STYLE_COMMENT = ByteString.encodeUtf8("*");
    static final ByteString STATE_END_OF_JSON = ByteString.EMPTY;

    JsonValueSource(BufferedSource bufferedSource) {
        this(bufferedSource, new Buffer(), STATE_JSON, 0);
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
    }

    public void discard() throws IOException {
        this.closed = true;
        while (this.state != STATE_END_OF_JSON) {
            advanceLimit(8192L);
            this.source.skip(this.limit);
        }
    }

    JsonValueSource(BufferedSource bufferedSource, Buffer buffer, ByteString byteString, int i2) {
        this.limit = 0L;
        this.closed = false;
        this.source = bufferedSource;
        this.buffer = bufferedSource.getBuffer();
        this.prefix = buffer;
        this.state = byteString;
        this.stackSize = i2;
    }

    private void advanceLimit(long j2) throws IOException {
        while (true) {
            long j3 = this.limit;
            if (j3 >= j2) {
                return;
            }
            ByteString byteString = this.state;
            ByteString byteString2 = STATE_END_OF_JSON;
            if (byteString == byteString2) {
                return;
            }
            if (j3 == this.buffer.size()) {
                if (this.limit > 0) {
                    return;
                } else {
                    this.source.require(1L);
                }
            }
            long jIndexOfElement = this.buffer.indexOfElement(this.state, this.limit);
            if (jIndexOfElement == -1) {
                this.limit = this.buffer.size();
            } else {
                byte b2 = this.buffer.getByte(jIndexOfElement);
                ByteString byteString3 = this.state;
                ByteString byteString4 = STATE_JSON;
                if (byteString3 == byteString4) {
                    if (b2 == 34) {
                        this.state = STATE_DOUBLE_QUOTED;
                        this.limit = jIndexOfElement + 1;
                    } else if (b2 == 35) {
                        this.state = STATE_END_OF_LINE_COMMENT;
                        this.limit = jIndexOfElement + 1;
                    } else if (b2 == 39) {
                        this.state = STATE_SINGLE_QUOTED;
                        this.limit = jIndexOfElement + 1;
                    } else if (b2 != 47) {
                        if (b2 != 91) {
                            if (b2 != 93) {
                                if (b2 != 123) {
                                    if (b2 != 125) {
                                    }
                                }
                            }
                            int i2 = this.stackSize - 1;
                            this.stackSize = i2;
                            if (i2 == 0) {
                                this.state = byteString2;
                            }
                            this.limit = jIndexOfElement + 1;
                        }
                        this.stackSize++;
                        this.limit = jIndexOfElement + 1;
                    } else {
                        long j4 = 2 + jIndexOfElement;
                        this.source.require(j4);
                        long j5 = jIndexOfElement + 1;
                        byte b4 = this.buffer.getByte(j5);
                        if (b4 == 47) {
                            this.state = STATE_END_OF_LINE_COMMENT;
                            this.limit = j4;
                        } else if (b4 == 42) {
                            this.state = STATE_C_STYLE_COMMENT;
                            this.limit = j4;
                        } else {
                            this.limit = j5;
                        }
                    }
                } else if (byteString3 == STATE_SINGLE_QUOTED || byteString3 == STATE_DOUBLE_QUOTED) {
                    if (b2 == 92) {
                        long j6 = jIndexOfElement + 2;
                        this.source.require(j6);
                        this.limit = j6;
                    } else {
                        if (this.stackSize > 0) {
                            byteString2 = byteString4;
                        }
                        this.state = byteString2;
                        this.limit = jIndexOfElement + 1;
                    }
                } else if (byteString3 == STATE_C_STYLE_COMMENT) {
                    long j7 = 2 + jIndexOfElement;
                    this.source.require(j7);
                    long j9 = jIndexOfElement + 1;
                    if (this.buffer.getByte(j9) == 47) {
                        this.limit = j7;
                        this.state = byteString4;
                    } else {
                        this.limit = j9;
                    }
                } else {
                    if (byteString3 != STATE_END_OF_LINE_COMMENT) {
                        throw new AssertionError();
                    }
                    this.limit = jIndexOfElement + 1;
                    this.state = byteString4;
                }
            }
        }
    }

    @Override // okio.Source
    public long read(Buffer buffer, long j2) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return 0L;
        }
        if (!this.prefix.exhausted()) {
            long j3 = this.prefix.read(buffer, j2);
            long j4 = j2 - j3;
            if (!this.buffer.exhausted()) {
                long j5 = read(buffer, j4);
                if (j5 != -1) {
                    return j5 + j3;
                }
            }
            return j3;
        }
        advanceLimit(j2);
        long j6 = this.limit;
        if (j6 == 0) {
            if (this.state == STATE_END_OF_JSON) {
                return -1L;
            }
            throw new AssertionError();
        }
        long jMin = Math.min(j2, j6);
        buffer.write(this.buffer, jMin);
        this.limit -= jMin;
        return jMin;
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public Timeout getTimeout() {
        return this.source.getTimeout();
    }
}
