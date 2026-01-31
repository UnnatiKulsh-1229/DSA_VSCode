function setMatrixZeroes(mat) {
    const n = mat.length, m = mat[0].length;
    let c0 = 1;

    // Traverse the array and mark 
    // first cell of each row and column
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < m; j++) {
            if (mat[i][j] === 0) {

                // mark i-th row
                mat[i][0] = 0;

                // mark j-th column
                if (j === 0)
                    c0 = 0;
                else
                    mat[0][j] = 0;
            }
        }
    }

    // Traverse and mark the matrix 
    // from (1, 1) to (n - 1, m - 1)
    for (let i = 1; i < n; i++) {
        for (let j = 1; j < m; j++) {

            // Check for col & row
            if (mat[i][0] === 0 || mat[0][j] === 0) {
                mat[i][j] = 0;
            }
        }
    }

    // Mark the first row
    if (mat[0][0] === 0) {
        for (let j = 0; j < m; j++)
            mat[0][j] = 0;
    }

    // Mark the first column
    if (c0 === 0) {
        for (let i = 0; i < n; i++)
            mat[i][0] = 0;
    }
}

// Driver Code
let mat = [
    [0, 1, 2, 0],
    [3, 4, 0, 2],
    [1, 3, 1, 5]
];

setMatrixZeroes(mat);

for (let row of mat) {
    console.log(row.join(" "));
}