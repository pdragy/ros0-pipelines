node {
    git url: 'https://github.com/ros-industrial/staubli.git', branch: 'indigo-devel'
    registerROS('ros:indigo-desktop-full', [
        'libopenblas-dev',
        'ros-indigo-industrial-robot-client',
        'ros-indigo-moveit-core'
    ], [])
}
