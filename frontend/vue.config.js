/* vue.config.js */
module.exports = {
    devServer: {
        proxy: {
            '/api': {
                target: 'http://subbak2.com/',
                changeOrigin: true,
                pathRewrite: {
                    '^/api': ''
                }
            }
        }
    },
    outputDir: '../src/main/resources/static',
};

