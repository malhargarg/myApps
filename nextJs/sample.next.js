// pages/index.js

import Head from 'next/head';
import Link from 'next/link';

export default function Home() {
  return (
    <div>
      <Head>
        <title>My Next.js App</title>
        <meta name="description" content="Welcome to my Next.js app" />
        <link rel="icon" href="/favicon.ico" />
      </Head>

      <main>
        <h1>Welcome to My Next.js App</h1>
        <p>This is a sample Next.js application.</p>
        <Link href="/about">
          <a>About</a>
        </Link>
      </main>

      <footer>
        <p>Footer content goes here.</p>
      </footer>

      <style jsx>{`
        main {
          padding: 20px;
        }
        footer {
          text-align: center;
          padding: 10px;
          position: fixed;
          bottom: 0;
          width: 100%;
          background-color: #f0f0f0;
        }
      `}</style>
    </div>
  );
}

//This is a basic example to get you started with Next.js. You can expand upon this file and add more functionality as needed for your application.