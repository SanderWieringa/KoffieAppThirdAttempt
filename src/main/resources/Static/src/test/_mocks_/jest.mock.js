jest.mock("../src/App.vue", jest.fn)

jest.mock('axios', () => ({
    get: jest.fn(() => Promise.resolve({ data: 3 }))
}))