/*
 * * Copyright (C) 2013-2015 Matt Baxter http://kitteh.org
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 * BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 * ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.kitteh.irc.client.library.event.client;

import org.kitteh.irc.client.library.Client;
import org.kitteh.irc.client.library.event.abstractbase.ClientEventBase;

import javax.annotation.Nonnull;

/**
 * The {@link Client} has disconnected from the server.
 */
public class ClientConnectionClosedEvent extends ClientEventBase {
    private final boolean reconnecting;

    /**
     * Constructs the event.
     *
     * @param client client for which this is occurring
     * @param reconnecting true if the client plans to reconnect
     */
    public ClientConnectionClosedEvent(@Nonnull Client client, boolean reconnecting) {
        super(client);
        this.reconnecting = reconnecting;
    }

    /**
     * Gets if the client plans to reconnect to the server.
     *
     * @return true if the client will attempt to reconnect
     */
    public boolean isReconnecting() {
        return this.reconnecting;
    }
}