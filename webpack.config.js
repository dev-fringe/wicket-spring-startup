const path = require('path');

module.exports = {
	mode: 'production',
	entry: './src/index.ts',
	// module: {
	// 	rules: [
	// 		{
	// 			test: /\.ts$/, loader: "ts-loader"
	// 		},
	// 		{
	// 			test: /\.css$/,
	// 			use: ["style-loader", "css-loader"]
	// 		}, {
	// 			test: /\.png$/,
	// 			loader: 'file-loader'
	// 		}
	// 	],
	// },
	// resolve: {
	// 	extensions: ['.ts'],
	// 	alias: {
	// 		"@src": path.resolve("./src")
	// 	}
	// },
	output: {
		filename: 'bundle.js',
		path: path.resolve(__dirname, 'src/main/webapp'),
	},
}