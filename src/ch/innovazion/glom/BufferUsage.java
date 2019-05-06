package ch.innovazion.glom;

import com.jogamp.opengl.GL4;

public enum BufferUsage {
	STATIC(GL4.GL_STATIC_DRAW),
	DYNAMIC(GL4.GL_DYNAMIC_DRAW),
	STREAM(GL4.GL_STREAM_DRAW),
	STATIC_READ(GL4.GL_STATIC_READ),
	DYNAMIC_READ(GL4.GL_DYNAMIC_READ),
	STREAM_READ(GL4.GL_STREAM_READ),
	STATIC_COPY(GL4.GL_STATIC_COPY),
	DYNAMIC_COPY(GL4.GL_DYNAMIC_COPY),
	STREAM_COPY(GL4.GL_STREAM_COPY);
	
	private final int usage;
	
	BufferUsage(int usage) {
		this.usage = usage;
	}
	
	public int getGLUsage() {
		return usage;
	}
}
